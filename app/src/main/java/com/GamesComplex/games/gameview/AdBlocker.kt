@file:Suppress("DEPRECATION")

package com.GamesComplex.games.gameview

import android.content.Context
import android.net.Uri
import android.os.AsyncTask
import android.text.TextUtils
import android.util.Log
import android.webkit.WebResourceResponse
import androidx.annotation.WorkerThread
import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL

object AdBlocker {
    private const val AD_HOSTS_FILE = "host.txt"
    private val AD_HOSTS: MutableSet<String?> = HashSet()
    @JvmStatic
    fun init(context: Context) {
        object : AsyncTask<Void?, Void?, Void?>() {
            @Deprecated("Deprecated in Java")
            protected override fun doInBackground(vararg p0: Void?): Void? {
                try {
                    loadFromAssets(context)
                } catch (e: IOException) {
                    // noop
                }
                return null
            }
        }.execute()
    }

    @WorkerThread
    @Throws(IOException::class)
    private fun loadFromAssets(context: Context) {
        val stream = context.assets.open(AD_HOSTS_FILE)
        val inputStreamReader = InputStreamReader(stream)
        val bufferedReader = BufferedReader(inputStreamReader)
        var line: String?
        while (bufferedReader.readLine().also { line = it } != null) AD_HOSTS.add(line)
        bufferedReader.close()
        inputStreamReader.close()
        stream.close()
    }

    @JvmStatic
    fun isAd(url: String?): Boolean {
        return try {
            isAdHost(getHost(url)) || AD_HOSTS.contains(Uri.parse(url).lastPathSegment)
        } catch (e: MalformedURLException) {
            Log.d("Ind", e.toString())
            false
        }
    }

    private fun isAdHost(host: String): Boolean {
        if (TextUtils.isEmpty(host)) {
            return false
        }
        val index = host.indexOf(".")
        return index >= 0 && (AD_HOSTS.contains(host) || index + 1 < host.length && isAdHost(
            host.substring(
                index + 1
            )
        ))
    }

    @Throws(MalformedURLException::class)
    fun getHost(url: String?): String {
        return URL(url).host
    }

    @JvmStatic
    fun createEmptyResource(): WebResourceResponse {
        return WebResourceResponse("text/plain", "utf-8", ByteArrayInputStream("".toByteArray()))
    }
}