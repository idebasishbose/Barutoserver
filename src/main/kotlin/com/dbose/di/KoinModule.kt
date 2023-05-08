package com.dbose.di

import com.dbose.repository.HeroRepository
import com.dbose.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}