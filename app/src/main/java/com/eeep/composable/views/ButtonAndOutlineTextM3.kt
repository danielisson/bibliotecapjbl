package com.eeep.composable.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonAndOutlineTextM3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var titulo by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            value = titulo,
            onValueChange = { titulo = it },
            label = { Text("Título") },
        )

        var autor by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            value = autor,
            onValueChange = { autor = it },
            label = { Text("Autor") },
        )

        var isbn by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            value = isbn,
            onValueChange = { isbn = it },
            label = { Text("ISBN") },
        )

        Button(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            onClick = {},
        ) {
            Text(text = "Cadastrar Livro")
        }
    }
}
