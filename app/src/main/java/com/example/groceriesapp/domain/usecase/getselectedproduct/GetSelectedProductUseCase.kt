package com.example.groceriesapp.domain.usecase.getselectedproduct

import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.model.ProductItem

class GetSelectedProductUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productId: Int): ProductItem {
        return repository.getSelectedProduct(productId = productId)
    }

}