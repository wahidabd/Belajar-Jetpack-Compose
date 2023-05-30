package com.wahidabd.composeui.data.repository

import com.wahidabd.composeui.data.repository.model.ProductItem
import com.wahidabd.composeui.data.repository.onboarding.OnBoardingOperations
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class Repository(
    private val dataStore: OnBoardingOperations,
    private val localDataSource: LocalDataSource
) {

    suspend fun saveOnBoarding(isCompleted: Boolean) {
        dataStore.saveBoardingState(isCompleted)
    }

    fun readOnBoardingState(): Flow<Boolean> = dataStore.readOnBoardingState()

    suspend fun insertProduct(products: List<ProductItem>){
        return localDataSource.insertProducts(products = products)
    }

    fun getAllProduct(): Flow<List<ProductItem>> {
        return localDataSource.getAllProduct()
    }

    suspend fun getSelectedProduct(productId: Int): ProductItem {
        return localDataSource.getSelectedProduct(productId)
    }

    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>> =
        localDataSource.getAllProductCart(isCart)

    suspend fun addCart(productItem: ProductItem) = localDataSource.addCart(productItem)

    suspend fun deleteCart(productItem: ProductItem) = localDataSource.deleteCart(productItem)

    fun searchProduct(query: String): Flow<List<ProductItem>> = localDataSource.searchProduct(query)

}