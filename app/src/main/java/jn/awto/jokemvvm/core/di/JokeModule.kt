package jn.awto.jokemvvm.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jn.awto.jokemvvm.data.api.JokeApi
import jn.awto.jokemvvm.data.repositories.JokeRemoteDataSource
import jn.awto.jokemvvm.data.repositories.JokeRemoteDataSourceImp
import jn.awto.jokemvvm.data.repositories.JokeRepositoryImp
import jn.awto.jokemvvm.domain.repositories.JokeRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object JokeModule {

    @Provides
    @Singleton
    fun provideJokeRepositoryImp(remoteRepository: JokeRemoteDataSourceImp): JokeRepository {
        return JokeRepositoryImp(remoteRepository)
    }

    @Provides
    @Singleton
    fun provideJokeRemoteDataSourceImp(api:JokeApi): JokeRemoteDataSource {
        return JokeRemoteDataSourceImp(api)
    }

}