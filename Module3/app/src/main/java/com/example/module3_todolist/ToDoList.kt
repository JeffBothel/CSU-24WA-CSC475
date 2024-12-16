package com.example.module3_todolist
import java.io.File
import java.io.FileWriter

class ToDoList(todoListTitle: String) {
    private var listCore: List<ToDoItem> = listOf()
    private var listTemp: List<ToDoItem> = listOf()
    private val listFile: File = File("$todoListTitle.txt")
    private val listFileWriter: FileWriter = FileWriter(listFile)
}