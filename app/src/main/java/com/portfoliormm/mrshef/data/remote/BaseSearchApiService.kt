package com.portfoliormm.mrshef.data.remote

import androidx.contentpager.content.Query
import com.portfoliormm.mrshef.data.model.SearchResponse

interface BaseSearchApiService {
    @GET("recipes/complexSearch")
    suspend fun searchRecipes(@Query("cuisine") cuisine:String):SearchResponse
}