package com.example.groceriesapp.domain.usecase.addcartusecase

import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.model.ProductItem

class AddCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.addCart(productItem)

}