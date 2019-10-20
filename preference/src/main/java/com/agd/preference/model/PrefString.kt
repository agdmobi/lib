package com.agd.preference.model

import android.support.annotation.WorkerThread
import com.agd.preference.SharedPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefString(private val name: String, private val defaultValue: String) : ReadWriteProperty<Any, String> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return SharedPreferenceManager.getInstance().getSharedPreference().getString(name, defaultValue)!!
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        SharedPreferenceManager.getInstance().getSharedPreference().edit().putString(name, value).apply()
    }

}