package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class AddProductToBillRequest(
    @field:SerializedName("promotion_package_id") var promotionId: String,
    @field:SerializedName("project_customer_bill_id") var customerBillId: String,
    @field:SerializedName("products") var products: ArrayList<ProjectProductRequest>
)

class ProjectProductRequest(
    @field:SerializedName("project_product_id") var productId: String,
    @field:SerializedName("quantity") var quantity: Int
)