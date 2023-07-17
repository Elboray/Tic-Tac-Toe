package com.chocolate.tic_tac_toe.domain.usecases

import com.chocolate.tic_tac_toe.data.repository.GameRepository
import com.chocolate.tic_tac_toe.domain.model.Player
import javax.inject.Inject

class CreatePlayerUseCase @Inject constructor(
    private val gameRepository: GameRepository
) {
    suspend operator fun invoke(name: String) {
        val playerId = System.currentTimeMillis().toString()

        val player = Player(
            id = playerId,
            name = name,
            previewsNames = listOf(name),
            score = 0,
        )
        gameRepository.createPlayer(player)
    }
}