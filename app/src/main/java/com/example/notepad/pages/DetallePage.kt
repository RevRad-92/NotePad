package com.example.notepad.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.Nota
import com.example.notepad.ui.theme.NotePadTheme

@Composable
fun DetallePage(
    modifier: Modifier = Modifier,
    nota: Nota
) {
    Column (modifier = modifier){
        Text(text = nota.titulo)
        Text(text = nota.cuerpo)
    }
}

@Preview(showBackground = true)
@Composable
fun DetallePagePreview() {
    val notas = remember { mutableStateListOf<String>()}
    NotePadTheme {
        DetallePage(nota = Nota("Titulo", cuerpo = "cuerpo de la nota"))
    }
}