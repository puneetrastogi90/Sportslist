package com.puneet.sportslist

import android.webkit.WebViewClient
import com.puneet.sportslist.base.BaseActivity
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : BaseActivity() {
    override fun defineLayoutResource(): Int {
        return R.layout.activity_web_view
    }

    override fun initializeComponents() {
        webView.settings.javaScriptEnabled = true
        webView.setWebViewClient(WebViewClient())
        val url: String? = intent!!.extras!!.getString("url")
        webView.loadUrl(url)

    }

}