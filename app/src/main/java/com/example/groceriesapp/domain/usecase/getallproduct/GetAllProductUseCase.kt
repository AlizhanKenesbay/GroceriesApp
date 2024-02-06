package com.example.groceriesapp.domain.usecase.getallproduct

import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

class GetAllProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<List<ProductItem>> = repository.getAllProduct()

}