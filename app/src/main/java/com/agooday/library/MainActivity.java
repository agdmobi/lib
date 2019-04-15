package com.agooday.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RangeDatePickerDialog(this).show();
        //SlyCalendarView d = findViewById(R.id.calendar);
        //Log.d("tien.hien","null = "+(d==null));
    }


    /*private fun pickDate() {
       calendarView.setCallback(object : Callback, com.agooday.daterangepicker.Callback {
            override fun onDataSelected(firstDate: Calendar?, secondDate: Calendar?, hours: Int, minutes: Int) =
                if (firstDate != null && secondDate != null) {
                    listener.okConfirm(firstDate, secondDate, hours, minutes)
                    dismiss()
                } else onCancelled()

            override fun onCancelled() {
                listener.onCancel()
                dismiss()
            }

        })
    }*/
}
