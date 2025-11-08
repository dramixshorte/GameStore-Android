@file:Suppress("DEPRECATION")

package com.GamesComplex.games

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.appopen.AppOpenAd
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback

class AppOpenManager
/** Constructor  */(private val myApplication: SplashActivity) : ActivityLifecycleCallbacks {
    private var appOpenAd: AppOpenAd? = null

    /** Request an ad  */
    fun fetchAd(appOpen_Ads_id: String) {
        AD_UNIT_ID = appOpen_Ads_id
        isShowingAd = false
        if (isAdAvailable) {
            return
        }
        /*
        //                        if (isShowingAd == false){
        //                            showAdIfAvailable();
        //                        }
        // Handle the error.
        //                        fetchAd();*/
        val loadCallback: AppOpenAdLoadCallback = object : AppOpenAdLoadCallback() {
            override fun onAdLoaded(ad: AppOpenAd) {
                appOpenAd = ad
                if (isShowingAd == false) {
                    showAdIfAvailable()
                }
                adLoaded = true
                Log.d("mmmm", "Load Success")
            }

            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                // Handle the error.
                Log.d("mmmm", "Load fail")
                //                        fetchAd();
                myApplication.intentToHomeScreen()
                myApplication.stopCountdown()
            }
        }
        val request = adRequest
        AppOpenAd.load(
            myApplication, AD_UNIT_ID, request,
            AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback
        )
    }

    fun showAdIfAvailable() {
        // Only show ad if there is not already an app open ad currently showing
        // and an ad is available.
        if (!isShowingAd && isAdAvailable) {
            Log.d(LOG_TAG, "Will show ad.")
            val fullScreenContentCallback: FullScreenContentCallback =
                object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        // Set the reference to null so isAdAvailable() returns false.
                        appOpenAd = null
                        isShowingAd = true
                        adLoaded = false
                        myApplication.intentToHomeScreen()
                        //                            fetchAd();
                    }

                    override fun onAdFailedToShowFullScreenContent(adError: AdError) {}
                    override fun onAdShowedFullScreenContent() {
                        isShowingAd = true
                    }
                }
            appOpenAd!!.fullScreenContentCallback = fullScreenContentCallback
            appOpenAd!!.show(myApplication)
        } else {
            Log.d(LOG_TAG, "Can not show ad.")
            fetchAd(AD_UNIT_ID)
        }
    }

    private val adRequest: AdRequest
        /** Creates and returns ad request.  */
        get() = AdRequest.Builder().build()
    val isAdAvailable: Boolean
        get() = appOpenAd != null

    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {}
    override fun onActivityStarted(activity: Activity) {}
    override fun onActivityResumed(activity: Activity) {}
    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {}
    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}

    companion object {
        private const val LOG_TAG = "mmmm"
        private var AD_UNIT_ID = "ca-app-pub-4577108052213259/9623362701"
        var isShowingAd = false
        var adLoaded = false
        @JvmStatic
        fun adsisLoaded(): Boolean {
            return adLoaded
        }

        fun adsisShowed(): Boolean {
            return isShowingAd
        }
    }
}