package com.example.kitsu.domain.models.manga

import com.example.domain.models.manga.MangaCharactersModel

data class RelationshipsModel(
    val genres: GenresModel,
    val categories: CategoriesModel,
    val castings: CastingsModel,
    val installments: InstallmentsModel,
    val mappings: MappingsModel,
    val reviews: ReviewsModel,
    val mediaRelationships: MediaRelationshipsModel,
    val chapters: ChaptersModel,
    val mangaCharacters: MangaCharactersModel,
    val mangaStaff: MangaStaffModel
)
