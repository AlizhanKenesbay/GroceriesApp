package com.example.groceriesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.groceriesapp.data.local.dao.ProductDao
import com.example.groceriesapp.domain.model.ProductItem

@Database(entities = [ProductItem::class], version = 3)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}