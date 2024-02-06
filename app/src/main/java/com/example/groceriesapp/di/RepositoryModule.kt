package com.example.groceriesapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import com.example.groceriesapp.data.repository.OnBoardingOperationImpl
import com.example.groceriesapp.data.repository.Repository
import com.example.groceriesapp.domain.repository.OnBoardingOperations
import com.example.groceriesapp.domain.usecase.UseCases
import com.example.groceriesapp.domain.usecase.addcartusecase.AddCartUseCase
import com.example.groceriesapp.domain.usecase.deletecartusecase.DeleteCartUseCase
import com.example.groceriesapp.domain.usecase.getallcartusecase.GetAllCartUseCase
import com.example.groceriesapp.domain.usecase.getallproduct.GetAllProductUseCase
import com.example.groceriesapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import com.example.groceriesapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import com.example.groceriesapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import com.example.groceriesapp.domain.usecase.saveproductusecase.InsertProductsUseCase
import com.example.groceriesapp.domain.usecase.searchproductusecase.SearchProductUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperation(
        @ApplicationContext context: Context
    ): OnBoardingOperations = OnBoardingOperationImpl(context = context)

    @Provides
    @Singleton
    fun provideUseCase(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            insertProductsUseCase = InsertProductsUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getSelectedProductUseCase = GetSelectedProductUseCase(repository),
            getAllProductUseCase = GetAllProductUseCase(repository),
            getAllCartUseCase = GetAllCartUseCase(repository),
            addCartUseCase = AddCartUseCase(repository),
            deleteCart = DeleteCartUseCase(repository),
            searchProductUseCase = SearchProductUseCase(repository)
        )
    }

}