package com.angel.conf.model

import java.io.Serializable
import  java.util.*

class Conferences: Serializable{
    lateinit var title: String
    lateinit var  description: String
    lateinit var tag: String
    lateinit var  datetime: Date
    lateinit var speaker: String
}