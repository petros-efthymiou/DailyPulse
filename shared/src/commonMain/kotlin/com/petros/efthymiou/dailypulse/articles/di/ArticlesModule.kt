package com.petros.efthymiou.dailypulse.articles.di

import com.petros.efthymiou.dailypulse.articles.ArticlesDataSource
import com.petros.efthymiou.dailypulse.articles.ArticlesRepository
import com.petros.efthymiou.dailypulse.articles.ArticlesService
import com.petros.efthymiou.dailypulse.articles.ArticlesUseCase
import com.petros.efthymiou.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}