package com.wahidabd.composeui.presentation.screen.search

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


class SearchViewModel (private val useCase: MyUseCase) : ViewModel() {
    private val _searchQuery = mutableStateOf("")
    val searchQuery = _searchQuery

    private val _searchProductList = MutableStateFlow<List<ProductItem>>(emptyList())
    val searchProductList = _searchProductList.asStateFlow()

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun searchProduct(query: String) {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.searchProduct(query).collect { values ->
                _searchProductList.value = values
            }
        }
    }
}