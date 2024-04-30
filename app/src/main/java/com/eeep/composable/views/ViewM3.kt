package com.eeep.composable.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun ViewM3()
{
    @Composable
    fun OutlineTextM3(){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            var titulo by remember { mutableStateOf("") }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                value = titulo,
                onValueChange = {titulo = it},
                label = {Text("Título")},
            )

            var autor by remember { mutableStateOf("") }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                value = autor,
                onValueChange = {},
                label = {Text("Autor")},
            )

            var isbn by remember { mutableStateOf("") }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                value = isbn,
                onValueChange = {},
                label = {Text("ISBN")},
            )
        }
    }

    @Composable
    fun ButtonM3(){
        Column {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ){
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                    }){
                    Text(text = "Cadastrar Livro")

                }
            }

        }
    }
}
