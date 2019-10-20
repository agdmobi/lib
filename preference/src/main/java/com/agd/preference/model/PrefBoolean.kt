package com.agd.preference.model

import android.support.annotation.WorkerThread
import com.agd.preference.SharedPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefBoolean(private val name: String, private val defaultValue: Boolean) : ReadWriteProperty<Any, Boolean> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Boolean {
        return SharedPreferenceManager.getInstance().getSharedPreference().getBoolean(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        SharedPreferenceManager.getInstance().getSharedPreference().edit().putBoolean(name, value).apply()
    }

}