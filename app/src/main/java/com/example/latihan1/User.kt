package com.example.latihan1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val username:String,
    val password:String
):Parcelable