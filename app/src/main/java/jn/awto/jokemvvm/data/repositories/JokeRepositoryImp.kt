package jn.awto.jokemvvm.data.repositories

import jn.awto.jokemvvm.domain.models.Joke
import jn.awto.jokemvvm.domain.repositories.JokeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class JokeRepositoryImp @Inject constructor(private val remoteRepository:JokeRemoteDataSource): JokeRepository {

    override fun getJoke(): Flow<Joke> = flow {
        emit(remoteRepository.getJoke())
    }

}
