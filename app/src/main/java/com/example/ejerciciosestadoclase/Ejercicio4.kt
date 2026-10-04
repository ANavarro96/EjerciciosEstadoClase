package com.example.ejerciciosestadoclase

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



@Composable
fun Ejercicio4(modifier: Modifier) {

    // Este es el estado, el animal seleccionado
    var animalSeleccionado by remember {
        mutableStateOf("Gato")
    }

    val imagen: Int
    val descripcion: String

    when (animalSeleccionado) {

        "Gato" -> {
            imagen = R.drawable.gato
            descripcion =
                "El gato es un animal independiente y curioso."
        }

        "Perro" -> {
            imagen = R.drawable.perro
            descripcion =
                "El perro es un animal sociable y activo."
        }

        else -> {
            imagen = R.drawable.conejo
            descripcion =
                "El conejo es un animal tranquilo y pequeño."
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        FichaAnimal(
            nombre = animalSeleccionado,
            descripcion = descripcion,
            imagen = imagen
        )

        HorizontalDivider(
            modifier = Modifier.padding(
                vertical = 16.dp
            )
        )

        Text(
            text = "Selecciona un animal:",
        )

        SelectorAnimal()
    }
}

@Composable
fun SelectorAnimal() {

    val animales = listOf(
        "Gato",
        "Perro",
        "Conejo"
    )

    Column {

        animales.forEach { animal ->

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                RadioButton(
                    selected = false // TODO
                       ,

                    onClick = {
                        // TODO
                    }
                )

                Text(
                    text = animal
                )
            }
        }
    }
}


@Composable
fun FichaAnimal(
    nombre: String,
    descripcion: String,
    imagen: Int
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {

        Image(
            painter = painterResource(imagen),
            contentDescription = nombre,
            modifier = Modifier
                .size(180.dp)
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Text(
            text = nombre
        )

        Text(
            text = descripcion,
            modifier = Modifier.padding(8.dp)
        )
    }
}