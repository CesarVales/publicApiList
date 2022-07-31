package com.example.testingrecycle

import com.google.gson.annotations.SerializedName

data class ApisResult (

    @SerializedName("count"   ) var count   : Int?               = null,
    @SerializedName("entries" ) var entries : ArrayList<Entries> = arrayListOf()

)
