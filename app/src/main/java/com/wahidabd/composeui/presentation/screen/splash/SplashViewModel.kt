package com.wahidabd.composeui.presentation.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wahidabd.composeui.domain.MyUseCase
import com.wahidabd.composeui.utils.DataDummy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class SplashViewModel(
    private val useCase: MyUseCase
) : ViewModel() {

    private val _onBoarding = MutableStateFlow(false)
    val onBoarding: StateFlow<Boolean> get() = _onBoarding

    init {
        viewModelScope.launch {
            useCase.insertProduct(DataDummy.generateDummyProduct())
        }

        viewModelScope.launch(Dispatchers.IO) {
            _onBoarding.value = useCase.readOnBoarding().stateIn(viewModelScope).value
        }
    }

}