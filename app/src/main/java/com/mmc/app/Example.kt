package com.mmc.app

import retrofit2.Retrofit


fun main() {

    val component: DIComponent = DaggerDIComponent.builder()
        .dIModule(DIModule())
        .build()

    val retrofit = component.client().retrofit("https://httpbin.org/")

    Example(retrofit).request()
}

class Example(private val retrofit: Retrofit) {

    fun request() {

        val service = retrofit.create(Service::class.java)

        service.callGet("get")
            .subscribe { d -> println(d) }

    }

}