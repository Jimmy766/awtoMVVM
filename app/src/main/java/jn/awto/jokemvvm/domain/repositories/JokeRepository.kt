package jn.awto.jokemvvm.domain.repositories

import jn.awto.jokemvvm.domain.models.Joke
import kotlinx.coroutines.flow.Flow


interface JokeRepository {
    fun getJoke(): Flow<Joke>
}