package com.example.groceriesapp.domain.usecase

import com.example.groceriesapp.domain.usecase.addcartusecase.AddCartUseCase
import com.example.groceriesapp.domain.usecase.deletecartusecase.DeleteCartUseCase
import com.example.groceriesapp.domain.usecase.getallcartusecase.GetAllCartUseCase
import com.example.groceriesapp.domain.usecase.getallproduct.GetAllProductUseCase
import com.example.groceriesapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import com.example.groceriesapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import com.example.groceriesapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import com.example.groceriesapp.domain.usecase.saveproductusecase.InsertProductsUseCase
import com.example.groceriesapp.domain.usecase.searchproductusecase.SearchProductUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val insertProductsUseCase: InsertProductsUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase,
    val getAllProductUseCase: GetAllProductUseCase,
    val getAllCartUseCase: GetAllCartUseCase,
    val addCartUseCase: AddCartUseCase,
    val deleteCart: DeleteCartUseCase,
    val searchProductUseCase: SearchProductUseCase
)