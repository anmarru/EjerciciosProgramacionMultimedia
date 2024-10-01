package com.ejerciciostema1.tema2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ejerciciostema1.tema2.ui.theme.Tema2Theme
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
       Text(
           text= "hola $name",
           textAlign = TextAlign.Right,
           modifier = Modifier.fillMaxWidth().padding(top= 16.dp )
       )
        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround,//dos o mas elementos
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text= "Hello $name!",
            )
            Text(
                text= "Hello $name!!!",
            )
            Text(
                text= "Hello $name :::",
            )
        }
    }
}



//@Preview(showBackground = true)
@Composable
fun MesajeBienvenida(pizzaria: String = "pizzeria" , direccion: String= "C/ Mayor 64", descripccion: String= "Pizzas, Pasta y bebidas "){
    Column {
        Text(
            text= "Bienvenidos a la $pizzaria Pasarela ",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text=" $direccion",
            textAlign = TextAlign.Right,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text= "$descripccion",
            textAlign = TextAlign.Right,
            modifier = Modifier.fillMaxWidth()
        )
        Row(horizontalArrangement = Arrangement.Center) {

            Button(onClick = {}) {
                Text(
                    text= "REGÍSTRATE"
                )
            }
            Button(onClick = {}) {
                Text(
                    text= "Login "
                )
            }
        }
    }
}

@Composable
fun DetallePedido(pedidoId: Int = 2, fecha: Date= Date(), precioTotal: Float = 254.0f){
    Column (
        modifier = Modifier.padding(32.dp)

    ){

    }
    //Detalle del pedido
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Text(text= "Pedido ID $pedidoId")
    }
}



@Preview(showBackground = true)//lo que se ve en el preview
@Composable
fun GreetingPreview() {
    MesajeBienvenida()
}