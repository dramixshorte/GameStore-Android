/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */

package com.GamesComplex.games.gameview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.GamesComplex.games.R;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class GameLoader extends AppCompatActivity {
    public static String game_url = "";
    WebView webView;
    LinearLayout InternetError;
    Button button;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_loader);

        // find local variable
        webView = findViewById(R.id.webview);
        InternetError = findViewById(R.id.internet_dialog);
        button = findViewById(R.id.tryBn);

        // internet page erorr button click activity page refresh
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
            }
        });

        /*All game loading settings code and you don't changes any settings*/
        AdBlocker.init(this);
        WebSettings settings = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().getAllowFileAccess();
        webView.getSettings().getDefaultFontSize();
        webView.setWebViewClient(new mWebViewClient());
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        settings.setDomStorageEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl(game_url);

    }

    //custom webview client you can more codes and settings
    private class mWebViewClient extends WebViewClient {

        private Map<String, Boolean> loadedUrls = new HashMap<>();

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Nullable
        @Override
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            boolean ad;
            if (!loadedUrls.containsKey(url)) {
                ad = AdBlocker.isAd(url);
                loadedUrls.put(url, ad);
            } else {
                ad = loadedUrls.get(url);
            }
            return ad ? AdBlocker.createEmptyResource() :
                    super.shouldInterceptRequest(view, url);
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            // no internet page code
            InternetError.setVisibility(View.VISIBLE);
            webView.setVisibility(View.GONE);
            super.onReceivedError(view, errorCode, description, failingUrl);
        }

    }
}