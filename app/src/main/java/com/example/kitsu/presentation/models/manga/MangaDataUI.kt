package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.MangaDataModel
import com.example.kitsu.presentation.base.BaseDiffModel
import com.example.kitsu.presentation.models.manga.toUI

data class MangaDataUI(
    override val id: String,
    val type: String,
    val links: LinksUI,
    val mangaDto: MangaUI,
    val relationships: RelationshipsUI
) : BaseDiffModel

fun MangaDataModel.toUI() =
    MangaDataUI(id, type, links.toUI(),
        mangaDto.toUI(),
        relationships.toUI()
    )