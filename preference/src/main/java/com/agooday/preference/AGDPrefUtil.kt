package com.agooday.preference

import android.content.Context

class AGDPrefUtil{
    lateinit var sADGPreferences: ADGPreferences
    fun initialize(context: Context) {
        sADGPreferences = ADGPreferences(context)
    }
    companion object {
        private var sInstance: AGDPrefUtil? = null
        fun getInstance(): AGDPrefUtil {
            if (sInstance == null) {
                sInstance = AGDPrefUtil()
            }
            return sInstance!!
        }
    }
}