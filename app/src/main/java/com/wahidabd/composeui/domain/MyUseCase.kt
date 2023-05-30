package com.wahidabd.composeui.domain

import com.wahidabd.composeui.data.repository.model.ProductItem
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


interface MyUseCase {
    suspend fun saveOnBoarding(isComplete: Boolean)
    fun readOnBoarding(): Flow<Boolean>
    suspend fun insertProduct(products: List<ProductItem>)
    suspend fun getSelectionProduct(productId: Int): ProductItem
    fun getAllProduct(): Flow<List<ProductItem>>
    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>>
    suspend fun addCart(productItem: ProductItem)
    suspend fun deleteCart(productItem: ProductItem)
    fun searchProduct(query: String): Flow<List<ProductItem>>
}