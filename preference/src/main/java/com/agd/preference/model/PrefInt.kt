package com.agd.preference.model

import android.support.annotation.WorkerThread
import com.agd.preference.SharedPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefInt(private val name: String, private val defaultValue: Int) : ReadWriteProperty<Any, Int> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return SharedPreferenceManager.getInstance().getSharedPreference().getInt(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        SharedPreferenceManager.getInstance().getSharedPreference().edit().putInt(name, value).apply()
    }

}