package com.vimalcvs.moviefindermvvm.data.repositories

import com.vimalcvs.moviefindermvvm.data.model.SearchResults
import com.vimalcvs.moviefindermvvm.data.network.ApiInterface
import com.vimalcvs.moviefindermvvm.data.network.SafeApiRequest

class HomeRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovies(
        searchTitle: String,
        apiKey: String,
        pageIndex: Int
    ): SearchResults {

        return apiRequest { api.getSearchResultData(searchTitle, apiKey, pageIndex) }
    }


}