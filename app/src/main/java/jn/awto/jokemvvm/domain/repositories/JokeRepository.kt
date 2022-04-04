package jn.awto.jokemvvm.domain.repositories

interface JokeRepository {
    suspend fun getJoke(): String
}