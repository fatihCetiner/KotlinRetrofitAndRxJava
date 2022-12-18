package com.fatihcetiner.retrofitkotlin.service

import com.fatihcetiner.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    // GET, POST, UPDATE, DELETE

    // https://api.nomics.com/v1/
    // markets?key=9a59189936a29108d994db85f88d8619dc9ae105

    // https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    //@GET("markets?key=9a59189936a29108d994db85f88d8619dc9ae105")
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>
    //fun getData(): Call<List<CryptoModel>>

}