package com.example.groceriesapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.groceriesapp.utils.Constants.PRODUCT_DATABASE_TABLE

@Entity(tableName = PRODUCT_DATABASE_TABLE)
data class ProductItem(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val description: String,
    val image: Int,
    val unit: String,
    val price: Int,
    val nutritions: String,
    val review: Double,
    var isCart: Boolean = false
)