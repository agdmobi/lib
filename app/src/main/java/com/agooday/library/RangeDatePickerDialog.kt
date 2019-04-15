package com.agooday.library

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import kotlinx.android.synthetic.main.dialog_date_range_picker.*
import java.util.*
import javax.security.auth.callback.Callback

class RangeDatePickerDialog(context: Context) : Dialog(context) {
    init {
        setCancelable(false)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_date_range_picker)
        window?.setLayout(
            (context.resources.displayMetrics.widthPixels * 0.9).toInt(),
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        calendarView.setCallback(object : Callback, com.agooday.daterangepicker.Callback {
            override fun onDataSelected(firstDate: Calendar?, secondDate: Calendar?, hours: Int, minutes: Int) {

                dismiss()
            }
            override fun onCancelled() {
                cancel()
            }
        })

    }


}