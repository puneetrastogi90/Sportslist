package viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.puneet.imageviewer.data.repository.NetworkState
import data.MyResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import models.Result
import repositories.SearchRepository
import utils.NoInternetException

class MainViewModel(val searchRepository: SearchRepository) : ViewModel() {
    companion object {
        val TAG = "MainViewModel"
    }

    private var job: Job? = null
    private val _networkState = MutableLiveData<NetworkState>()
    val networkState: LiveData<NetworkState>
        get() = _networkState

    private val _results = MutableLiveData<Result>()
    val results: LiveData<Result>
        get() = _results


    fun getSearchResults(str: String) {
        if (job?.isActive == true) {
            return
        }
        job = getResults(str)
    }

    private fun getResults(str: String): Job? {
        return viewModelScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                _networkState.value = NetworkState.LOADING
            }
            val result = searchRepository.getResultsForString(str)
            withContext(Dispatchers.Main) {
                if (result is MyResult.Success) {
                    _results.value = result.data
                    _networkState.value = NetworkState.LOADED
                } else if (result is MyResult.Error) {
                    if (result.exception is NoInternetException) {
                        _networkState.value = NetworkState.NO_INTERNET_ERROR
                    }

                    Log.e(TAG, "Failed")
                }
            }
        }
    }


}