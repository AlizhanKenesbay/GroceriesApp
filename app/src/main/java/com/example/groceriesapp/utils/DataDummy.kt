package com.example.groceriesapp.utils

import com.example.groceriesapp.R
import com.example.groceriesapp.domain.model.AboutItem
import com.example.groceriesapp.domain.model.CategoryItem
import com.example.groceriesapp.domain.model.ProductItem
import com.example.groceriesapp.ui.theme.BackgroundCategory1
import com.example.groceriesapp.ui.theme.BackgroundCategory2
import com.example.groceriesapp.ui.theme.BackgroundCategory3
import com.example.groceriesapp.ui.theme.BackgroundCategory4
import com.example.groceriesapp.ui.theme.BackgroundCategory5
import com.example.groceriesapp.ui.theme.BackgroundCategory6

object DataDummy {

    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "Султан Спираль",
                description = "Макароны из твердых сортов пшеницы в форме спиралей изготовлены без ГМО и не развариваются при варке. Превосходный гарнир, вкусно сочетающийся с соусами, овощами, мясом или птицей.",
                image = R.drawable.product1,
                unit = "1 шт. 400гр",
                price = 405,
                nutritions = "400гр",
                review = 3.5,
            ),
            ProductItem(
                id = 2,
                title = "Яйца QARQUS",
                description = "Наверное, нет в природе и нашем холодильнике продукта проще и необходимее, чем куриное яйцо. Начиная с сырого яйца, которые пьют, приправив перцем и солью, взбивают в гоголь-моголь, до яиц, сваренных всмятку, в мешочек, пашот и вкрутую.",
                image = R.drawable.product2,
                unit = "10 шт. 65гр",
                price = 749,
                nutritions = "65гр",
                review = 5.0
            ),
            ProductItem(
                id = 3,
                title = "Майонез",
                description = "Майонез 3 Желания Провансаль 67% с дозатором классический майонез, густой сметанообразной консистенции, разнообразит ваши блюда и сделает их более вкусными, благодаря удобному дозатору, майонез не заветривается и сохраняет свои вкусовые качества дольше.",
                image = R.drawable.product3,
                unit = "1 шт. 700гр",
                price = 1179,
                nutritions = "700гр",
                review = 4.0
            ),
            ProductItem(
                id = 4,
                title = "Паста Barilla",
                description = "Макароны Barilla «Спагеттини» — одна из разновидностей длинной пасты родом из солнечной Италии. Их можно назвать младшими братьями традиционных спагетти, так как они более тонкие и изящные.",
                image = R.drawable.product4,
                unit = "1 шт. 450гр",
                price = 555,
                nutritions = "450гр",
                review = 4.7
            ),
            ProductItem(
                id = 5,
                title = "Корень Имбиря",
                description = "Имбирь – как говорят на востоке — это корень здоровья и первый шаг к стройной фигуре, положительно влияет на динамику сбрасывания лишнего веса. Имбирь широко используют при приготовлении блюд азиатской кухни, его также добавляют в маринады, чаи и даже джемы.",
                image = R.drawable.product5,
                unit = "1 шт. 200гр",
                price = 699,
                nutritions = "200гр",
                review = 4.2
            ),
            ProductItem(
                id = 6,
                title = "Coca-cola",
                description = "Легендарный напиток Coca Cola с ярким вкусом колы и с искрящимися пузырьками газа, приятно бьющими маленькими фонтанчиками и ярким вкусом колы вкусно освежит в жаркий день и наполнит жизненной энергией.",
                image = R.drawable.product6,
                unit = "1 шт. 330 мл",
                price = 436,
                nutritions = "330 мл",
                review = 3.8
            ),
            ProductItem(
                id = 7,
                title = "Филе Бройлера",
                description = "Куриное филе — один из универсальных продуктов, которое можно приготовить различными способами: отварить, поджарить, потушить, запечь, приготовить на гриле или в коптильне. Из куриного филе готовят фарш для приготовления котлет или запеканок, можно мелко нарезать филе, добавить приправы, яйцо и майонез (любой соус по вкусу), репчатый лук и немного муки, перемешать и обжарить в виде оладьев. ",
                image = R.drawable.product7,
                unit = "1 шт. 700гр",
                price = 2600,
                nutritions = "700гр",
                review = 3.0
            ),
            ProductItem(
                id = 8,
                title = "Яблочный Сок",
                description = "Цвет: Сок красивого янтарного цвета.\n" + "\n" + "Вкус: Вкус сока свежий, сочный, насыщенный с приятными яблочными тонами и характерной кислинкой.\n" + "\n" + "Аромат: Сок обладает приятным ароматом с нотами спелых яблок.",
                image = R.drawable.product8,
                unit = "1 шт. 1л",
                price = 885,
                nutritions = "1л",
                review = 4.2
            ),
            ProductItem(
                id = 9,
                title = "Gracia Сок",
                description = "Натуральный апельсиновый сок Gracio Апельсин благодаря богатому витаминному составу, в особенности витамину С — превосходно защищает организм от простуды, вирусов и эффективно повышает иммунитет.",
                image = R.drawable.product9,
                unit = "1 шт. 950мл",
                price = 824,
                nutritions = "950мл",
                review = 4.7
            ),
            ProductItem(
                id = 10,
                title = "Бананы",
                description = "Бананы десертные обладают плотной, сладкой мякотью и освежающим ароматом с травянистыми нотками. Цвет бананов может варьироваться от салатного до желтого цвета.",
                image = R.drawable.product10,
                unit = "8 шт. 900гр",
                price = 1050,
                nutritions = "900гр",
                review = 4.5
            )
        )
    }

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Фрукты и Овощи",
                image = R.drawable.category1,
                background = BackgroundCategory1
            ),
            CategoryItem(
                title = "Масла и Соусы",
                image = R.drawable.category2,
                background = BackgroundCategory2
            ),
            CategoryItem(
                title = "Мясо и Птица",
                image = R.drawable.category3,
                background = BackgroundCategory3
            ),
            CategoryItem(
                title = "Хлебные Изделия",
                image = R.drawable.category4,
                background = BackgroundCategory4
            ),
            CategoryItem(
                title = "Молочные продукты",
                image = R.drawable.category5,
                background = BackgroundCategory5
            ),
            CategoryItem(
                title = "Алкоголь",
                image = R.drawable.category6,
                background = BackgroundCategory6
            )
        )
    }

    fun generateDummyAbout(): List<AboutItem> {
        return listOf(
            AboutItem(
                image = R.drawable.ic_orders,
                title = "Заказы"
            ),
            AboutItem(
                image = R.drawable.ic_my_details,
                title = "Мой профиль"
            ),
            AboutItem(
                image = R.drawable.ic_address,
                title = "Адрес доставки"
            ),
            AboutItem(
                image = R.drawable.ic_payment,
                title = "Способ оплаты"
            ),
            AboutItem(
                image = R.drawable.ic_notification,
                title = "Уведомления"
            ),
        )
    }

}