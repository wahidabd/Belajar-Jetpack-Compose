package com.wahidabd.composeui.domain

import com.wahidabd.composeui.data.repository.Repository
import com.wahidabd.composeui.data.repository.model.ProductItem
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class MyInteractor(private val repository: Repository) : MyUseCase {

    override suspend fun saveOnBoarding(isComplete: Boolean) {
        repository.saveOnBoarding(isComplete)
    }

    override fun readOnBoarding(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }

    override suspend fun insertProduct(products: List<ProductItem>) {
        repository.insertProduct(products)
    }

    override suspend fun getSelectionProduct(productId: Int): ProductItem {
        return repository.getSelectedProduct(productId = productId)
    }

    override fun getAllProduct(): Flow<List<ProductItem>> {
        return repository.getAllProduct()
    }

    override fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>> {
        return repository.getAllProductCart(isCart)
    }

    override suspend fun addCart(productItem: ProductItem) {
        repository.addCart(productItem)
    }

    override suspend fun deleteCart(productItem: ProductItem) {
        repository.deleteCart(productItem = productItem)
    }

    override fun searchProduct(query: String): Flow<List<ProductItem>> {
        return repository.searchProduct(query)
    }
}