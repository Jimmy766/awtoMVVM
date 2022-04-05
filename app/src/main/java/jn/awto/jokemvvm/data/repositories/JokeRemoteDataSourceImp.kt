package jn.awto.jokemvvm.data.repositories

import jn.awto.jokemvvm.data.api.JokeApi
import jn.awto.jokemvvm.domain.models.Joke
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class JokeRemoteDataSourceImp @Inject constructor(private val api:JokeApi): JokeRemoteDataSource {
    override suspend fun getJoke() : Joke{
        return withContext(Dispatchers.IO){
            val response= api.getJoke()
            response.body()!!
        }
    }
}