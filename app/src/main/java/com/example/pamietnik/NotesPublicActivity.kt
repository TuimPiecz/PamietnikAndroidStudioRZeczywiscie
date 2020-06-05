package com.example.pamietnik


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.pamietnik.remote.BackendService
import com.example.pamietnik.remote.RetrofitClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class NotesPublicActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notes_public)
        System.out.println("rozmiar listy cokolwiek1")
        val client = RetrofitClient().provideRetrofit().create(BackendService::class.java)
        System.out.println("rozmiar listy cokolwiek2")
        client.getNotes()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                System.out.println("rozmiar listy cokolwiek")
                System.out.println("rozmiar list ${it.Notes?.size}")
            }, {
                it.printStackTrace()
            })

    }
}