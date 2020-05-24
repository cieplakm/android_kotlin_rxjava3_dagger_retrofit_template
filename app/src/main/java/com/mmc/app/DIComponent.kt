package com.mmc.app


import dagger.Component
import javax.inject.Singleton

@Component(modules = [DIModule::class])
@Singleton
interface DIComponent {

    fun client(): HttpClient

}