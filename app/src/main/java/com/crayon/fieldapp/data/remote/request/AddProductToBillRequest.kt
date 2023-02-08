package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.google.gson.annotations.SerializedName

class AddPromotionGiftRequest(
    @field:SerializedName("promotions") var promotions: ArrayList<AddPromotionRequest>,
    @field:SerializedName("gifts") var gifts: ArrayList<ProjectGiftRequest>
)

class AddPromotionRequest(
    @field:SerializedName("promotion_package_id") var promotionId: String,
    @field:SerializedName("quantity") var quantity: Int,
    @field:SerializedName("products") var products: ArrayList<ProjectProductRequest>
)

class ProjectProductRequest(
    @field:SerializedName("project_product_id") var productId: String,
    @field:SerializedName("quantity") var quantity: Int,
    @field:SerializedName("price") var price: Int
)

class ProjectGiftRequest(
    @field:SerializedName("project_gift_id") var giftId: String,
    @field:SerializedName("quantity") var quantity: Int
)