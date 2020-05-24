package com.mmc.app

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DIModule {

    @Provides
    @Singleton
    fun provideClient(): HttpClient {
        return HttpClient()
    }

}