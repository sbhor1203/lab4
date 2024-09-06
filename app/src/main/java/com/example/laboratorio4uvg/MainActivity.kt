package com.example.laboratorio4uvg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio4uvg.Pages.Settings
import com.example.laboratorio4uvg.Pages.TheProfile
import com.example.laboratorio4uvg.ui.theme.Laboratorio4UvgTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4UvgTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TheProfile(modifier = Modifier.padding(innerPadding)) // llamando al paquete de pages para cada pantalla
                    //Settings(modifier = Modifier.padding(innerPadding)) // pantalla de settings

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4UvgTheme {
        Greeting("Android")
    }
}