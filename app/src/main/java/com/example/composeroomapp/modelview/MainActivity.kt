package com.example.composeroomapp.modelview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composeroomapp.data.AppDatabase
import com.example.composeroomapp.view.TaskApp

class MainActivity : ComponentActivity() {

    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar la base de datos
        database = AppDatabase.getDatabase(this)

        setContent {
            TaskApp(database)
        }
    }
}
