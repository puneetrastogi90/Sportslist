package com.puneet.imageviewer.data.api

import android.content.Context
import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Response
import utils.NoInternetException

class NetworkConnectionInterceptor(context: Context) : Interceptor {

    private val appContext = context.applicationContext
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable())
            throw NoInternetException("No Internet Connection Found. Showing Cached Info.")
        return chain.proceed(chain.request())
    }


    private fun isInternetAvailable(): Boolean {

        val connectivityManager =
            appContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        connectivityManager.activeNetworkInfo.also {
            return it != null && it.isConnected
        }

    }
}