package com.petros.efthymiou.dailypulse.sources.presentation

import com.petros.efthymiou.dailypulse.sources.application.Source

data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)
