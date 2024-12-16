package com.example.module3_todolist
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Setting up the database that stores the various items
        val todoDB = Room.databaseBuilder(
            applicationContext,
            ToDoDatabase::class.java, "todoDB"
        ).build()

        // Data access object that connects to the database
        val todoDAO = todoDB.ToDoDao()

        // List of all the To Do list items stored in the database to be used with the app
        val todoList: List<ToDoItem> = todoDAO.getAllItems()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}