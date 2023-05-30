package com.wahidabd.composeui.presentation.screen.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wahidabd.composeui.data.repository.model.ProductItem
import com.wahidabd.composeui.domain.MyUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class HomeViewModel(private val useCase: MyUseCase) : ViewModel() {

    private val _searchQuery = mutableStateOf("")
    val searchQuery = _searchQuery

    private val _productList = MutableStateFlow<List<ProductItem>>(emptyList())
    val productList = _productList.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.getAllProduct().collect { value ->
                _productList.value = value
            }
        }
    }

    fun addCart(productItem: ProductItem) = viewModelScope.launch {
        useCase.addCart(productItem)
    }

}