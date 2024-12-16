package com.example.module3_todolist
import androidx.room.Dao
import androidx.room.Query
import com.example.module3_todolist.ToDoItem

@Dao
interface ToDoDao {
    @Query("SELECT * FROM todoitem")
    fun getAllItems(): List<ToDoItem>
}