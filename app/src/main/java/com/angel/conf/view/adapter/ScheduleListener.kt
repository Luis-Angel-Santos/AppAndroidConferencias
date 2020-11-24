package com.angel.conf.view.adapter

import com.angel.conf.model.Conferences


interface ScheduleListener {
    fun onConferenceClicked(conference: Conferences, position: Int)
}