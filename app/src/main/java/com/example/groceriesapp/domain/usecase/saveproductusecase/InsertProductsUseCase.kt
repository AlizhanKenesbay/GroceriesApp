package com.example.groceriesapp.domain.usecase.saveproductusecase

import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.model.ProductItem

class InsertProductsUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(products: List<ProductItem>) = repository.insertProducts(products)

}