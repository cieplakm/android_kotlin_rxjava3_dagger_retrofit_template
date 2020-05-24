package com.mmc.app

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {

    @GET("/{path}")
    fun callGet(@Path("path") p: String): Observable<HttpBinData>

}