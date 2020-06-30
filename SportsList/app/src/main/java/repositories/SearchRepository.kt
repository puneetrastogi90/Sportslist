package repositories

import com.puneet.imageviewer.data.api.RetrofitApiInterface
import data.MyResult
import models.Result

class SearchRepository(private val apiService: RetrofitApiInterface) {
    var searchDataSource: SearchDataSource = SearchDataSource(apiService)


    suspend fun getResultsForString(str: String): MyResult<Result> {
        var queryParams = mapOf<String, String>("query" to str)
        return searchDataSource.getResults(queryParams)
    }
}