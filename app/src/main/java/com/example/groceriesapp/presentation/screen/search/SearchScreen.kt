package com.example.groceriesapp.presentation.screen.search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.groceriesapp.R
import com.example.groceriesapp.presentation.common.content.EmptyContent
import com.example.groceriesapp.presentation.common.content.ListContentProduct
import com.example.groceriesapp.presentation.component.SearchViewBar
import com.example.groceriesapp.ui.theme.DIMENS_16dp
import com.example.groceriesapp.utils.showToastShort


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val mContext = LocalContext.current
    val searchQuery by searchViewModel.searchQuery
    val productsList by searchViewModel.searchProductList.collectAsState()

    Scaffold {
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            SearchViewBar(
                query = searchQuery,
                hint = stringResource(id = R.string.search_store),
                onValueChange = {
                    searchViewModel.apply {
                        updateSearchQuery(query = it)
                        searchProduct(query = it)
                    }
            },
                onClickSearch = {
                    searchViewModel.searchProduct(query = it)
                }
            )

            Spacer(modifier = Modifier.height(DIMENS_16dp))

            if (searchQuery.isNotEmpty()) ListContentProduct(
                title = "Найденные товары",
                products = productsList,
                navController = rememberNavController(),
                onClickToCart = { productItem ->
                    mContext.showToastShort("${productItem.title} добавлен в корзину")
                    searchViewModel.addCart(productItem.copy(isCart = true))
                }
            )
            else EmptyContent()
        }
    }
}