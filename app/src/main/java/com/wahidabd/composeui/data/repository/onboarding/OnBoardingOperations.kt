package com.wahidabd.composeui.data.repository.onboarding

import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


interface OnBoardingOperations {

    suspend fun saveBoardingState(isCompleted: Boolean)
    fun readOnBoardingState(): Flow<Boolean>

}