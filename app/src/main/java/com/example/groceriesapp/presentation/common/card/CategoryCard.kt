package com.example.groceriesapp.presentation.common.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.groceriesapp.R
import com.example.groceriesapp.domain.model.CategoryItem
import com.example.groceriesapp.ui.theme.BackgroundCategory3
import com.example.groceriesapp.ui.theme.Black
import com.example.groceriesapp.ui.theme.DIMENS_12dp
import com.example.groceriesapp.ui.theme.DIMENS_16dp
import com.example.groceriesapp.ui.theme.DIMENS_174dp
import com.example.groceriesapp.ui.theme.DIMENS_1dp
import com.example.groceriesapp.ui.theme.DIMENS_20dp
import com.example.groceriesapp.ui.theme.DIMENS_40dp
import com.example.groceriesapp.ui.theme.DIMENS_80dp
import com.example.groceriesapp.ui.theme.GilroyFontFamily
import com.example.groceriesapp.ui.theme.TEXT_SIZE_16sp

@Composable
fun CategoryCard(
    modifier: Modifier = Modifier,
    categoryItem: CategoryItem,
) {
    Card(
        modifier = modifier.height(DIMENS_174dp),
        shape = RoundedCornerShape(DIMENS_12dp),
        border = BorderStroke(DIMENS_1dp, Color.LightGray),
        backgroundColor = categoryItem.background
    ) {
        Column(
            modifier = modifier
                .padding(PaddingValues(horizontal = DIMENS_40dp, vertical = DIMENS_16dp))
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(DIMENS_80dp),
                painter = painterResource(id = categoryItem.image),
                contentDescription = stringResource(R.string.image_category)
            )

            Spacer(modifier = Modifier.height(DIMENS_20dp))

            Text(
                text = categoryItem.title,
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = TEXT_SIZE_16sp,
                color = Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview
@Composable
fun CategoryCardPreview() {
    CategoryCard(
        categoryItem = CategoryItem(
            title = "Fresh Fruits\n" + "& Vegetable",
            image = R.drawable.category2,
            background = BackgroundCategory3
        )
    )
}