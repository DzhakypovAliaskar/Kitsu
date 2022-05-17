package com.example.kitsu.domain.models.manga

import com.example.kitsu.domain.models.manga.MetaModel

data class PosterImageModel(
    val tiny: String,
    val small: String,
    val medium: String,
    val large: String,
    val original: String,
    val meta: MetaModel
)
