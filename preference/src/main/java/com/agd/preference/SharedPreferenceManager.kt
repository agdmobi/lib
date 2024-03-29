package com.agd.preference

import android.content.Context

 class SharedPreferenceManager{
    lateinit var sADGPreferences: ADGPreference
    fun initialize(context: Context) {
        sADGPreferences = ADGPreference(context)
    }

    fun getSharedPreference() :ADGPreference{
        return sADGPreferences
    }

    companion object {
        private var sInstance: SharedPreferenceManager? = null
        fun getInstance(): SharedPreferenceManager {
            if (sInstance == null) {
                sInstance = SharedPreferenceManager()
            }
            return sInstance!!
        }
    }
}