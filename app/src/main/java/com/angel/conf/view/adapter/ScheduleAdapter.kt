package com.angel.conf.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.angel.conf.R
import com.angel.conf.model.Conferences

class ScheduleAdapter() : RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {

    var listConference = ArrayList<Conferences>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.item_schedule, parent, false))

    override fun getItemCount() = listConference.size

    override fun onBindViewHolder(holder: ScheduleAdapter.ViewHolder, position: Int) {

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvConferenceName = itemView.findViewById<TextView>(R.id.tvItemScheduleConferencename)
        val tvConferenceSpeaker = itemView.findViewById<TextView>(R.id.tvItemScheduleConferencenSpeaker)
        val tvConferenceTag = itemView.findViewById<TextView>(R.id.tvItemScheduleTag)
        val tvConferenceHour = itemView.findViewById<TextView>(R.id.tvItemSchedulehour)
        val tvConferenceAMPM = itemView.findViewById<TextView>(R.id.tvItemScheduleAMPM)
    }

}