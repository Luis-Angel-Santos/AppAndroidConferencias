package com.angel.conf.view.ui.fragments

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.angel.conf.R
import com.angel.conf.model.Conferences
import kotlinx.android.synthetic.main.fragment_schedule_detail_dialog.*
import java.text.SimpleDateFormat

class ScheduleDetailDialogFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_schedule_detail_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tolbarConference.navigationIcon = ContextCompat.getDrawable(view.context, R.drawable.ic_close)
        tolbarConference.setTitleTextColor(Color.WHITE)
        tolbarConference.setNavigationOnClickListener{
            dismiss()
    }

        val conference = arguments?.getSerializable("conference") as Conferences
        tolbarConference.title = conference.title

        tvItemScheduleTituloConferencia.text = conference.title
        val pattern = "dd/MM/yyyy hh:mm a"
        val simpleOF = SimpleDateFormat(pattern)
        val date = simpleOF.format(conference.datetime)
        tvDetailConferenceHour.text = date
        tvDetailConferenceSpeaker.text = conference.speaker
        tvDetailConferenceTag.text =  conference.tag
        tvDetailConferenceDescription.text = conference.description
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    }


}