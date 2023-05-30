package com.wahidabd.composeui.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.wahidabd.composeui.data.repository.model.ProductItem


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Database(entities = [ProductItem::class], version = 1)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        private var INSTANCE: ProductDatabase? = null

        fun getDatabase(context: Context): ProductDatabase {
            if (INSTANCE == null){
                INSTANCE = Room
                    .databaseBuilder(context.applicationContext, ProductDatabase::class.java, "favorite")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }

        fun destroyDb(){
            INSTANCE = null
        }
    }

}