package com.agd.preference.model

import android.support.annotation.WorkerThread
import com.agd.preference.SharedPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefLong(private val name: String, private val defaultValue: Long) : ReadWriteProperty<Any, Long> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Long {
        return SharedPreferenceManager.getInstance().getSharedPreference().getLong(name, defaultValue)
    }
    override fun setValue(thisRef: Any, property: KProperty<*>, value: Long) {
        SharedPreferenceManager.getInstance().getSharedPreference().edit().putLong(name, value).apply()
    }
}