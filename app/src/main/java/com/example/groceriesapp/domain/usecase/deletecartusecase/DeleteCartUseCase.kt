package com.example.groceriesapp.domain.usecase.deletecartusecase

import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.model.ProductItem

class DeleteCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.deleteCart(productItem)

}