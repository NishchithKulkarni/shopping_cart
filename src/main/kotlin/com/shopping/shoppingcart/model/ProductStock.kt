package com.shopping.shoppingcart.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("shopping_cart")
data class ProductStock(
    var prodId:String?,
    var StockId:String?,
    var StockQuantity:String
)