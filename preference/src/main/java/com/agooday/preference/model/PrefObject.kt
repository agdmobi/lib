package com.agooday.preference.model

import com.agooday.preference.AGDPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefObject(private val name: String, private val defaultValue: Any) : ReadWriteProperty<Any, Any> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Any {
        return when (defaultValue) {
            is String -> AGDPreferenceManager.getInstance().sADGPreferences.getString(name, defaultValue)!!
            is Long -> AGDPreferenceManager.getInstance().sADGPreferences.getLong(name, defaultValue)
            is Int -> AGDPreferenceManager.getInstance().sADGPreferences.getInt(name, defaultValue)
            is Float -> AGDPreferenceManager.getInstance().sADGPreferences.getFloat(name, defaultValue)
            else -> AGDPreferenceManager.getInstance().sADGPreferences.getBoolean(name, defaultValue as Boolean)
        }
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Any) {
        when (defaultValue) {
            is String -> AGDPreferenceManager.getInstance().sADGPreferences.edit().putString(name, defaultValue).apply()
            is Long ->  AGDPreferenceManager.getInstance().sADGPreferences.edit().putLong(name, defaultValue).apply()
            is Int ->  AGDPreferenceManager.getInstance().sADGPreferences.edit().putInt(name, defaultValue).apply()
            is Float ->  AGDPreferenceManager.getInstance().sADGPreferences.edit().putFloat(name, defaultValue).apply()
            else ->  AGDPreferenceManager.getInstance().sADGPreferences.edit().putBoolean(name, defaultValue as Boolean).apply()
        }
    }

}