package com.example.exercicio_2_android_studio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.G
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicio_2_android_studio.ui.theme.Exercicio2AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercicio2AndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaInicial(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaInicial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF9F8FD)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { 
        Pergunta()

        Numero()

        Botoes()
    }
}

@Composable
fun Pergunta(modifier: Modifier = Modifier) {
    Row(

    ) {
        Text(
            text = "Qual é a sua idade?",
            fontSize = 30.sp,
            color = Color(0xFF4B57B2)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))
    Row(

    ) {
        Text(
            text = "Aperte os botões para informar a sua idade",
            fontSize = 17.sp,
            color = Color(0xFF313136)
        )
    }
}

@Composable
fun Numero(modifier: Modifier = Modifier) {
    Text("20")
}

@Composable
fun Botoes(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        var idade by remember {
            mutableStateOf(0)
        }
        Button(
            onClick = {
                if (idade > 0) {
                    idade--
                } else {
                    idade = 0
                }
            },
            modifier = Modifier.height(65.dp).width(85.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("+")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = {

            },
            modifier = Modifier.height(65.dp).width(85.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("-")
        }
    }
}

