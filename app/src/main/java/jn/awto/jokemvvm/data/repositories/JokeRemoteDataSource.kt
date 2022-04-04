package jn.awto.jokemvvm.data.repositories

import jn.awto.jokemvvm.domain.models.Joke
import kotlinx.coroutines.flow.Flow


interface JokeRemoteDataSource {
    suspend fun getJoke(): Joke
}