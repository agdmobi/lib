package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPrefUtil
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefLong(private val name: String, private val defaultValue: Long) : ReadWriteProperty<Any, Long> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Long {
        return AGDPrefUtil.getInstance().sADGPreferences.getLong(name, defaultValue)
    }
    override fun setValue(thisRef: Any, property: KProperty<*>, value: Long) {
        AGDPrefUtil.getInstance().sADGPreferences.edit().putLong(name, value).apply()
    }
}