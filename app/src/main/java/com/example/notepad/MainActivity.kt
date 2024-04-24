package com.example.notepad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.notepad.pages.MainPage
import com.example.notepad.ui.theme.NotePadTheme

/*
    Quiero una app que me permita escribir notas (título y descripción), listarlas y poder acceder a ellas.

    Lista -> Detalle [Patrón]
    Nueva Nota

    Ej:
    Lista productos -> producto
    Lista infinita de post -> Post
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotePadTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

