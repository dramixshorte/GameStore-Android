/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */
package com.GamesComplex.games.adsnetwork

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.LinearLayout
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.GamesComplex.games.R

object Admob {
    var targetActivity: Intent? = null
    @JvmField
    var fullScreenAdMaxShowCount = 3 //? interstitial show total count in this app
    @JvmField
    var FULLSCREEN_AD_LOAD_COUNT = 0
    @JvmField
    var mInterstitialAd: InterstitialAd? = null
    @JvmStatic
    fun BannerAds(banner: LinearLayout, context: Context) {
        MobileAds.initialize(context) { }
        // Start loading ads here...
        val adView = AdView(context)
        banner.addView(adView)
        adView.adUnitId = context.getString(R.string.ADMOB_BANNER_UNIT_ID)
        adView.setAdSize(AdSize.BANNER)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    //admob interstitial full setup code you can change anything
    @JvmStatic
    fun FullscreenAd(context: Context) {
        //Requesting for a fullscreen Ad
        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            context,
            context.getString(R.string.ADMOB_INTERSTITIAL_UNIT_ID),
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    // The mInterstitialAd reference will be null until
                    // an ad is loaded.
                    mInterstitialAd = interstitialAd

                    //Fullscreen callback || Requesting again when an ad is shown already
                    mInterstitialAd!!.fullScreenContentCallback =
                        object : FullScreenContentCallback() {
                            override fun onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                                //User dismissed the previous ad. So we are requesting a new ad here
                                FULLSCREEN_AD_LOAD_COUNT++
                                FullscreenAd(context)
                                Log.d("FULLSCREEN_AD", "" + FULLSCREEN_AD_LOAD_COUNT)
                                if (targetActivity != null) context.startActivity(targetActivity)
                            }
                        } // FullScreen Callback Ends here
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    // Handle the error
                    mInterstitialAd = null
                }
            })
    }
}