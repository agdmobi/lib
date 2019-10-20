package com.agd.preference.model

import android.support.annotation.WorkerThread
import com.agd.preference.SharedPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefFloat(private val name: String, private val defaultValue: Float) : ReadWriteProperty<Any, Float> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Float {
        return SharedPreferenceManager.getInstance().getSharedPreference().getFloat(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Float) {
        SharedPreferenceManager.getInstance().getSharedPreference().edit().putFloat(name, value).apply()
    }

}