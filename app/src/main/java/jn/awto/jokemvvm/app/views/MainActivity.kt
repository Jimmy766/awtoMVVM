package jn.awto.jokemvvm.app.views

import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import jn.awto.jokemvvm.app.viewmodels.JokeViewModel
import jn.awto.jokemvvm.databinding.ActivityMainBinding
import jn.awto.jokemvvm.domain.models.Joke
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val jokeViewModel: JokeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        jokeViewModel.getNextJoke()

        lifecycleScope.launchWhenStarted {
            jokeViewModel.progress.collect {
                binding.progressBar.visibility = if (it) ProgressBar.VISIBLE else ProgressBar.GONE
            }
        }

        jokeViewModel.joke.observe(this) {
            setupJoke(it)
        }

        binding.viewContainer.setOnClickListener {
            clearJoke()
            jokeViewModel.getNextJoke()
        }



    }
    private fun setupJoke(joke: Joke) {
        with(binding) {
            setupJokeText.text = joke.setup ?: joke.joke
            deliveryJokeText.text = joke.delivery ?: ""
            flagsJokeText.text = if ( joke.flags!=null ) joke.flags.format() else "Not Received"
        }
    }
    private fun clearJoke() {
        with(binding) {
            setupJokeText.text = ""
            deliveryJokeText.text = ""
            flagsJokeText.text = ""
        }
    }
}