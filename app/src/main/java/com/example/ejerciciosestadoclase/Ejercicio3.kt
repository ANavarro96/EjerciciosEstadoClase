package com.example.ejerciciosestadoclase

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
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
fun EjercicioCheckbox(modifier: Modifier) {


    // TODO CUAL ES EL ESTADO?

    Column(
        modifier = modifier
    ) {

        Text(
            text = "Selecciona tus aficiones"
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = false, // TODO,
                onCheckedChange = {
                    // TODO
                }
            )

            Text("Música")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = false , // TODO,
                onCheckedChange = {
                    // TODO
                }
            )

            Text("Anime")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = false, // TODO,
                onCheckedChange = {
                    // TODO
                }
            )

            Text("Fortnite")
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        val seleccionados = 0
            // TODO: Contar cuantos valores se han seleccionado

        Text(
            text = "Has seleccionado $seleccionados opciones"
        )

        // TODO: ¿Cómo podriamos añadir un botón para poder ver el texto?
    }
}