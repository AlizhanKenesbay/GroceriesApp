package com.example.groceriesapp.domain.usecase.searchproductusecase

import com.example.groceriesapp.data.repository.Repository

class SearchProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(query: String) = repository.searchProduct(query)

}