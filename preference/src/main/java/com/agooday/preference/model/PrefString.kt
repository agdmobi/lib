package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPrefUtil
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefString(private val name: String, private val defaultValue: String) : ReadWriteProperty<Any, String> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return AGDPrefUtil.getInstance().sADGPreferences.getString(name, defaultValue)!!
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        AGDPrefUtil.getInstance().sADGPreferences.edit().putString(name, value).apply()
    }

}