package com.wahidabd.composeui.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.wahidabd.composeui.data.repository.model.ProductItem
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */

@Dao
interface ProductDao{
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insertProduct(products: List<ProductItem>)

    @Query("SELECT * FROM product_table")
    fun getAllProducts(): Flow<List<ProductItem>>

    @Query("SELECT * FROM product_table WHERE id=:productId")
    fun getProductById(productId: Int): ProductItem

    @Query("SELECT * FROM product_table WHERE isCart=:isCart")
    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCart(productItem: ProductItem)

    @Update
    suspend fun deleteCart(productItem: ProductItem)

    @Query("SELECT * FROM product_table WHERE title LIKE '%' || :query || '%'")
    fun searchProduct(query: String): Flow<List<ProductItem>>
}