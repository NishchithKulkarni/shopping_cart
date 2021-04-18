package com.shopping.shoppingcart.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("shopping_cart")
data class Customer(
    var custId:String?,
    var custName:String?,
    var productCode:String?
)
