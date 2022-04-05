package jn.awto.jokemvvm.data.repositories

import jn.awto.jokemvvm.domain.models.Joke


interface JokeRemoteDataSource {
    suspend fun getJoke(): Joke
}