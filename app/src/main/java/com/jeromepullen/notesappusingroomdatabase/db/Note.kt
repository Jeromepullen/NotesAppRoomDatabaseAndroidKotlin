package com.jeromepullen.notesappusingroomdatabase.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity  // Table in Database
data class Note(

    val title:String,
    val note:String
) : Serializable{
    @PrimaryKey(autoGenerate = true)
    var id :Int =0
}