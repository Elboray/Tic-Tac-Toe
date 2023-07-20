package com.chocolate.tic_tac_toe.domain.usecase

import com.chocolate.tic_tac_toe.data.repository.GameRepository
import javax.inject.Inject

class UpdatePlayerStateUseCase @Inject constructor(
    private val gameRepository: GameRepository
) {
    suspend operator fun invoke(playerId: String, isWaiting: Boolean) {
        gameRepository.updatePlayerState(playerId, isWaiting)
    }
}