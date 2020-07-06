package com.vimalcvs.moviefindermvvm.data.repositories

import com.vimalcvs.moviefindermvvm.data.model.MovieDetail
import com.vimalcvs.moviefindermvvm.data.network.ApiInterface
import com.vimalcvs.moviefindermvvm.data.network.SafeApiRequest

class MovieDetailRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovieDetail(
        title: String,
        apiKey: String
    ): MovieDetail {

        return apiRequest { api.getMovieDetailData(title, apiKey) }
    }


}