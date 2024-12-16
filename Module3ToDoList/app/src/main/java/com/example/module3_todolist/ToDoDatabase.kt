package com.example.module3_todolist
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 2,
    entities = [ToDoItem::class],
    exportSchema = true,
    autoMigrations = [
        AutoMigration(from = 1, to = 2)
    ]
)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun ToDoDao(): ToDoDao
}