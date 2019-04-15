package com.agooday.library;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.agooday.daterangepicker.Callback;
import com.agooday.daterangepicker.SlyCalendarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void pickDate(){
        //RangeDatePickerDialog dialog = new RangeDatePickerDialog(this,new DatePickerDialog.OnDateSetListener())
        SlyCalendarView d = findViewById(R.id.slyCalendar);

        d.setCallback(new Callback() {
            @Override
            public void onCancelled() {

            }

            @Override
            public void onDataSelected(Calendar firstDate, Calendar secondDate, int hours, int minutes) {

            }
        });
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
