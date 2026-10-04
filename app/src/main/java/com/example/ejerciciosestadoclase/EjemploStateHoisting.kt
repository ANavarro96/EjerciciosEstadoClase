package com.example.ejerciciosestadoclase

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BloqueBoton(colorBoton: Color, texto: String, eventoPadre : () -> Unit){

    var textoBoton by remember {
        mutableStateOf(texto)
    }

    Button(onClick = {
        // Puedo hacer otras modificaciones del estado del propio componente...
        textoBoton = "Boton pulsado!"

        // .. y como eventoPadre es una función, asi que la puedo llamar
        eventoPadre()
    },
        colors = ButtonColors(
            containerColor = colorBoton,
            contentColor = ButtonDefaults.buttonColors().contentColor,
            disabledContainerColor = ButtonDefaults.buttonColors().disabledContainerColor,
            disabledContentColor = ButtonDefaults.buttonColors().disabledContentColor,
        )){
        Text(textoBoton)
    }
}

@Composable
fun ColumnaBotones(miModifier: Modifier){

    var colorColumna by remember { mutableStateOf(Color.White) }

    Column(miModifier.fillMaxSize().background(colorColumna)) {
        BloqueBoton(Color.Red, "Boton rojo",
            { colorColumna = Color.Red})
        BloqueBoton(Color.Blue, "Boton azul",
            { colorColumna = Color.Blue})
        BloqueBoton(Color.Yellow, "Boton Amarillo",
            { colorColumna = Color.Yellow})
    }
}