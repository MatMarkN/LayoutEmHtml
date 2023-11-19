package com.example.layoutemhtml

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutemhtml.ui.theme.LayoutEmHtmlTheme
import android.annotation.SuppressLint


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
        val webSettings: WebSettings = webView.settings
        val jsInterface: JavaScriptInterface = JavaScriptInterface(this)
        webView.addJavascriptInterface(jsInterface, "Android")

        webSettings.javaScriptEnabled = true

        webView.loadUrl("file:///android_asset/index.html")
    }
}