package com.wahidabd.composeui.data.repository

import com.wahidabd.composeui.data.local.ProductDao
import com.wahidabd.composeui.data.local.ProductDatabase
import com.wahidabd.composeui.data.repository.model.ProductItem
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class LocalDataSource(productDatabase: ProductDatabase) {

    private val db: ProductDao = productDatabase.productDao()

    suspend fun insertProducts(products: List<ProductItem>){
        return db.insertProduct(products)
    }

    fun getAllProduct(): Flow<List<ProductItem>> = db.getAllProducts()

    suspend fun getSelectedProduct(productId: Int): ProductItem {
        return db.getProductById(productId)
    }

    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>> {
        return db.getAllProductCart(isCart)
    }

    suspend fun addCart(productItem: ProductItem){
        return db.addCart(productItem)
    }

    suspend fun deleteCart(productItem: ProductItem){
        productItem.isCart = false
        db.deleteCart(productItem)
    }

    fun searchProduct(query: String): Flow<List<ProductItem>> {
        return db.searchProduct(query)
    }

}