package jn.awto.jokemvvm.data.repositories

interface JokeRemoteDataSource {
    suspend fun getJoke(): String
}