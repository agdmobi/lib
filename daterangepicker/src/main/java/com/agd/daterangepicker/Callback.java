package com.agd.daterangepicker;

import java.util.Calendar;

public interface Callback {
    void onCancelled();

    void onDataSelected(Calendar firstDate, Calendar secondDate, int hours, int minutes);
}
