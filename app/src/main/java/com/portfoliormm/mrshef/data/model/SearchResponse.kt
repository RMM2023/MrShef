package com.portfoliormm.mrshef.data.model

data class SearchResponse(
    val cuisine: String,
    val diet: String,
    val intolerances: String,
    val type: String,
    val instructionsRequired: Boolean,
    val addRecipeInformation: Boolean,
    val addRecipeNutrition: Boolean,
    val author: String,
    val tags: String,
    val titleMatch: String,
    val maxReadyTime: Int,
    val minServings: Int,
    val minCarbs: Int,
    val minProtein: Int,
    val minCalories: Int,
    val minFat: Int,
    val minAlcohol: Int,
    val minCaffeine: Int
)
