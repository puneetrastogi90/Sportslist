package repositories

import android.util.Log
import com.puneet.imageviewer.data.api.RetrofitApiInterface
import data.MyResult
import utils.FileUtils
import utils.NoInternetException
import java.lang.RuntimeException

class SearchDataSource(private val apiService: RetrofitApiInterface) {

    suspend fun getResults(queryMap: Map<String, String>): MyResult<models.Result> {
        try {
            val response = apiService.getSearchResults(queryMap).execute()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    val data = body
                    return MyResult.Success(data)
                }
            }
        } catch (e: NoInternetException) {
            return MyResult.Error(e)
        }
        Log.e("error", "Error While Fetching Results")
        return MyResult.Error(RuntimeException("Error While Fetching Results"))
    }
}