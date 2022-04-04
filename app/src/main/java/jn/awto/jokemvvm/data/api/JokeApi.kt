package jn.awto.jokemvvm.data.api

import jn.awto.jokemvvm.domain.models.Joke
import retrofit2.Response
import retrofit2.http.GET

interface JokeApi {
    @GET("/joke/Any")
    suspend fun getJoke(): Response<Joke>
}