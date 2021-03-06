package com.jeromepullen.notesappusingroomdatabase.db

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
     suspend fun addNote(note:Note)

    @Query("SELECT * FROM note ORDER BY id DESC")
    suspend fun getAllNotes():List<Note>

    @Insert
    suspend fun addMUltipleNote(vararg note: Note)

    @Update
    suspend fun updateNote(note:Note)

    @Delete
    suspend fun deleteNote(note: Note)
}