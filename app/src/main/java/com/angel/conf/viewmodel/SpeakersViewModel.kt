package com.angel.conf.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.angel.conf.model.Speaker
import com.angel.conf.network.Callback
import com.angel.conf.network.FirestoreService
import java.lang.Exception

class SpeakersViewModel: ViewModel(){
    val firestoreService = FirestoreService()
    var listSpeakers: MutableLiveData<List<Speaker>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh(){
        getSpeakersFromFirebase()
    }

    fun getSpeakersFromFirebase(){
        firestoreService.getSpeakers(object : Callback<List<Speaker>>{
            override fun onSuccess(result: List<Speaker>?) {
                listSpeakers.postValue(result)
                proccessFinished()
            }

            override fun onFailed(exception: Exception) {
                proccessFinished()
            }
        })
    }

    private  fun proccessFinished(){
        isLoading.value = true
    }
}