package com.example.pamietnik.data


import com.google.gson.annotations.SerializedName

data class NotesItem(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("trescWpisu")
    var trescWpisu: String?,
    @SerializedName("uzytkownik")
    var uzytkownik: String?,
    @SerializedName("wpisPubliczny")
    var wpisPubliczny: Boolean?
)