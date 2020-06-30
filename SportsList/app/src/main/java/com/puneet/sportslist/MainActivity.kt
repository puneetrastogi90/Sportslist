package com.puneet.sportslist

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.puneet.imageviewer.data.api.NetworkConnectionInterceptor
import com.puneet.imageviewer.data.api.RetrofitApiInterface
import com.puneet.imageviewer.data.api.RetrofitClient
import com.puneet.imageviewer.data.repository.NetworkState
import com.puneet.sportslist.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import repositories.SearchRepository
import viewmodels.MainViewModel

class MainActivity : BaseActivity(), View.OnClickListener, AdapterInteractionListener {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var searchRepository: SearchRepository
    private val searchBox by lazy {
        findViewById<EditText>(R.id.search_box)
    }

    private val adapter by lazy {
        SearchResultsAdapter(this)
    }

    override fun defineLayoutResource(): Int {
        return R.layout.activity_main
    }

    override fun initializeComponents() {
        val apiService: RetrofitApiInterface =
            RetrofitClient.getClient(NetworkConnectionInterceptor(this));
        searchRepository = SearchRepository(apiService)
        mainViewModel = getViewModel()

        setupRecyclerView()
        setupTextBox()
        mainViewModel.getSearchResults("")
        mainViewModel.results.observe(this, Observer {
            adapter.setDataSource(it.hits)
        })

        mainViewModel.networkState.observe(this, Observer {
            when (it) {
                NetworkState.NO_INTERNET_ERROR -> Toast.makeText(
                    this,
                    "No Internet Connection",
                    Toast.LENGTH_LONG
                ).show()
            }
        })

    }

    private fun getViewModel(): MainViewModel {
        return ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                @Suppress("UNCHECKED_CAST")
                return MainViewModel(searchRepository) as T
            }
        })[MainViewModel::class.java]
    }

    private fun setupTextBox() {
        search_button.setOnClickListener(this)
    }

    private fun setupRecyclerView() {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.search_button -> startSearch()
        }
    }


    private fun startSearch() {
        mainViewModel.getSearchResults(searchBox.text.toString())
    }

    override fun onItemClick(url: String) {
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }


}


interface AdapterInteractionListener {
    fun onItemClick(url: String)
}