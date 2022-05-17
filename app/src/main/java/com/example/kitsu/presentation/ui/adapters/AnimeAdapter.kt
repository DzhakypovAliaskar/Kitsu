package com.example.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemAnimeBinding
import com.example.kitsu.presentation.base.BaseDiffUtil
import com.example.kitsu.presentation.extentions.loadImageWithGlide
import com.example.kitsu.presentation.models.anime.AnimeDataUI

class AnimeAdapter(
    private val onClick: (id: String,videoId : String?) -> Unit
) :
    PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {
    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animeDataDto: AnimeDataUI) {
            binding.imImage.loadImageWithGlide(animeDataDto.animeDto.posterImage?.original)

            binding.root.setOnClickListener {
                onClick(animeDataDto.id, animeDataDto.animeDto.youtubeVideoId)
            }




        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            (ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }

    }

}

