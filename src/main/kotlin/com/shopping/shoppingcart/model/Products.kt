package com.shopping.shoppingcart.model

import org.springframework.data.mongodb.core.mapping.Document


@Document("shopping_cart")
data class Products(
    var productCode: String?,
    var productName:String?,
    var productDesc:String?


)