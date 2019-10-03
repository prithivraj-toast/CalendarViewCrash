package com.zestworks.calendarviewcrash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val minCal = Calendar.getInstance()
        minCal.set(2019, 9, 3, 9,0)

        val maxCal = Calendar.getInstance()
        maxCal.set(2019, 9, 7, 11, 0)
        calendarView.minDate = minCal.timeInMillis
        calendarView.maxDate = maxCal.timeInMillis
    }
}
