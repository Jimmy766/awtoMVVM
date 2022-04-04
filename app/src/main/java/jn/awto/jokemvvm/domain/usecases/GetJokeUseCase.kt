package jn.awto.jokemvvm.domain.usecases

import jn.awto.jokemvvm.domain.repositories.JokeRepository
import javax.inject.Inject

class GetJokeUseCase @Inject constructor(
    private val jokeRepository: JokeRepository
) {
    operator fun invoke() = jokeRepository.getJoke();
}
