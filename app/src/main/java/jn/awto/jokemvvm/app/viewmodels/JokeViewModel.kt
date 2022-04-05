package jn.awto.jokemvvm.app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import jn.awto.jokemvvm.domain.models.Joke
import jn.awto.jokemvvm.domain.usecases.GetJokeUseCase
import javax.inject.Inject

@HiltViewModel
class JokeViewModel @Inject constructor( private val getJokeUseCase: GetJokeUseCase):ViewModel() {
    val joke= getJokeUseCase().asLiveData()
    fun getNextJoke(): LiveData<Joke> {
        return getJokeUseCase().asLiveData()
    }

}