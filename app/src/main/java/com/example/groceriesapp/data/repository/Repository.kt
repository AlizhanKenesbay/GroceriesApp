package com.example.groceriesapp.data.repository

import com.example.groceriesapp.domain.model.ProductItem
import com.example.groceriesapp.domain.repository.LocalDataSource
import com.example.groceriesapp.domain.repository.OnBoardingOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val dataStore: OnBoardingOperations,
    private val localDataSource: LocalDataSource
) {

    suspend fun saveOnBoardingState(isCompleted: Boolean) {
        dataStore.saveOnBoardingState(isCompleted = isCompleted)
    }

    fun readOnBoardingState(): Flow<Boolean> = dataStore.readOnBoardingState()

    suspend fun insertProducts(products: List<ProductItem>) =
        localDataSource.insertProducts(products)

    fun getAllProduct(): Flow<List<ProductItem>> = localDataSource.getAllProduct()

    suspend fun getSelectedProduct(productId: Int): ProductItem =
        localDataSource.getSelectedProduct(productId = productId)

    fun getAllProductCart(isCart: Boolean): Flow<List<ProductItem>> =
        localDataSource.getAllProductCart(isCart)

    suspend fun addCart(productItem: ProductItem) = localDataSource.addCart(productItem)

    suspend fun deleteCart(productItem: ProductItem) = localDataSource.deleteCart(productItem)

    fun searchProduct(query: String): Flow<List<ProductItem>> = localDataSource.searchProduct(query)

}