package com.wahidabd.composeui.presentation.screen.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wahidabd.composeui.domain.MyUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class OnBoardingViewModel(private val useCase: MyUseCase) : ViewModel(){

    fun saveOnBoardingState(isCompleted: Boolean){
        viewModelScope.launch(Dispatchers.IO){
            useCase.saveOnBoarding(isCompleted)
        }
    }

}