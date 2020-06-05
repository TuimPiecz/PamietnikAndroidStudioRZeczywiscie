package com.example.pamietnik
import android.annotation.TargetApi
import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.Menu
import android.view.MenuItem

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService
import java.util.*

class SetAlarmActivity: AppCompatActivity(),TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {
    private var minute=0
    private var hour=0
    private var dayOfMonth=0
    private var month=0
    private var year=0
    lateinit var  alarmManager: AlarmManager
    lateinit var alarmIntent: PendingIntent
    @TargetApi(Build.VERSION_CODES.O)
    val date= Calendar.Builder()
        .setDate(year,month,dayOfMonth)
        .setTimeOfDay(hour,minute,0)
        .build()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_alarm)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        alarmManager=getSystemService(Context.ALARM_SERVICE) as AlarmManager
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        this.minute=minute
        this.hour=hourOfDay
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        this.year=year
        this.month=month
        this.dayOfMonth=dayOfMonth
    }
}