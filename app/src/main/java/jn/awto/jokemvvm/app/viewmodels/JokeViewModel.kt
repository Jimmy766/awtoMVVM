package jn.awto.jokemvvm.app.viewmodels

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import jn.awto.jokemvvm.domain.models.Joke
import jn.awto.jokemvvm.domain.usecases.GetJokeUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JokeViewModel @Inject constructor( private val getJokeUseCase: GetJokeUseCase):ViewModel() {
    private val _joke= MutableLiveData<Joke>()
    val joke: LiveData<Joke> = _joke
    private var _process = MutableStateFlow(true)
    val progress:StateFlow<Boolean> get() = _process
    fun getNextJoke(){
        viewModelScope.launch {
            _process.value=true
            getJokeUseCase().collect {
                _joke.value=it
                _process.value=false
            }

        }
    }

}