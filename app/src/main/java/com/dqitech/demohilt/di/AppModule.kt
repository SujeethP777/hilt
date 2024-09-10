package com.dqitech.demohilt.di

import com.dqitech.demohilt.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMyRepository(): MyRepository {
        return MyRepository()
    }
}