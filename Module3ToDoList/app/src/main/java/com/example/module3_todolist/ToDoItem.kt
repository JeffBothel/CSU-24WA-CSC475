package com.example.module3_todolist
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoItem (
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "Title") val Title: String?,
    @ColumnInfo(name = "Completed") val Completed: Boolean?
)