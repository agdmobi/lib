package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPrefUtil
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefBoolean(private val name: String, private val defaultValue: Boolean) : ReadWriteProperty<Any, Boolean> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Boolean {
        return AGDPrefUtil.getInstance().sADGPreferences.getBoolean(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        AGDPrefUtil.getInstance().sADGPreferences.edit().putBoolean(name, value).apply()
    }

}