package com.example.groceriesapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface OnBoardingOperations {

    suspend fun saveOnBoardingState(isCompleted: Boolean)
    fun readOnBoardingState(): Flow<Boolean>

}