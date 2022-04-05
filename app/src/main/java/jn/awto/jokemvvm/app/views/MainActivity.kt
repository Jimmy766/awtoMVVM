package jn.awto.jokemvvm.app.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jn.awto.jokemvvm.app.viewmodels.JokeViewModel
import jn.awto.jokemvvm.databinding.ActivityMainBinding
import jn.awto.jokemvvm.domain.models.Joke

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val jokeViewModel: JokeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        jokeViewModel.joke.observe(this) {
            setupJoke(it)
        }

        binding.viewContainer.setOnClickListener {
            jokeViewModel.getNextJoke().observe(this) {
                setupJoke(it)
            }
        }
    }
    private fun setupJoke(joke: Joke) {
        with(binding) {
            setupJokeText.text = joke.setup ?: "Not Received"
            deliveryJokeText.text = joke.delivery ?: "Not Received"
            flagsJokeText.text = if ( joke.flags!=null ) joke.flags.format() else "Not Received"
        }
    }
}