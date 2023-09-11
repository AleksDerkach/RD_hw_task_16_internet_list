package com.example.task_16_hometask_lists

import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {
    @GET("/superhero-api/api/all.json") //
    //fun getSuperHero(): Single<SuperHeroResponse>
    fun getSuperHero(): Single<List<SuperHero>>


}