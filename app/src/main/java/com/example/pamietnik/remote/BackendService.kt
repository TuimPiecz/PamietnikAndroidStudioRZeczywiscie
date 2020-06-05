package com.example.pamietnik.remote

import io.reactivex.Single
import retrofit2.http.GET

interface BackendService {
    @GET("all")
    fun getNotes(): Single<List<NotesItem>>
}