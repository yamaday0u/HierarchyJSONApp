package com.example.hierarchyjsonapp

import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("name")
    var name: String,
    @SerializedName("age")
    var age: Int,
    @SerializedName("address")
    var address: Address
)

data class Address(
    @SerializedName("prefecture")
    var prefecture: String,
    @SerializedName("city")
    var city: String,
    @SerializedName("address_line1")
    var addressLine1: String,
    @SerializedName("address_line2")
    var addressLine2: String
)