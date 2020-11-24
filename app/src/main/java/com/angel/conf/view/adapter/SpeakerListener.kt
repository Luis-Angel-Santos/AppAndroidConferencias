package com.angel.conf.view.adapter

import com.angel.conf.model.Speaker

interface SpeakerListener {
    fun onSpeakerClicked(speaker: Speaker, position: Int)
}