package com.example.ejerciciosestadoclase

import android.R
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
import kotlin.random.Random

@Composable
fun BloqueBoton(texto: String, eventoPadre: (Color) -> Unit){

    var textoAMostrar by remember { mutableStateOf(texto) }

    val colorRandom = Color(
        Random.nextInt(256),
        Random.nextInt(256),
        Random.nextInt(256)
    )
    Button(onClick = {

        // Podemos gestionar el estado internamente....
        textoAMostrar = "Boton pulsado"

        // Y luego lanzar los eventos proporcionados por el padre
        eventoPadre(colorRandom)
    },
        colors = ButtonColors(
            containerColor = colorRandom,
            contentColor = ButtonDefaults.buttonColors().contentColor,
            disabledContainerColor = ButtonDefaults.buttonColors().disabledContainerColor,
            disabledContentColor = ButtonDefaults.buttonColors().disabledContentColor,
        )){
        Text(textoAMostrar)
    }
}

@Composable
fun EjemploSH(miModifier: Modifier){

    var colorColumna by remember { mutableStateOf(Color.White) }

    Column(miModifier.fillMaxSize().background(colorColumna)) {
        BloqueBoton("Primer Boton", eventoPadre = {
            colorRecibido -> colorColumna = colorRecibido
        })
        BloqueBoton("Segundo Boton",eventoPadre = {
                colorRecibido -> colorColumna = colorRecibido
        })
        BloqueBoton( "Tercer Boton",eventoPadre = {
                colorRecibido -> colorColumna = colorRecibido
        })
    }
}