package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPrefUtil
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefInt(private val name: String, private val defaultValue: Int) : ReadWriteProperty<Any, Int> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return AGDPrefUtil.getInstance().sADGPreferences.getInt(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        AGDPrefUtil.getInstance().sADGPreferences.edit().putInt(name, value).apply()
    }

}