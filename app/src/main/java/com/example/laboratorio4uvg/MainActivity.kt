package com.example.laboratorio4uvg

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import com.example.laboratorio4uvg.Pages.InformacionCampus
//import com.example.laboratorio4uvg.Pages.PantallaEmergencias
//import com.example.laboratorio4uvg.Pages.Settings
import com.example.laboratorio4uvg.Pages.TheProfile
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio4uvg.Pages.Settingsapp
import com.example.laboratorio4uvg.Pages.TheProfile
import com.example.laboratorio4uvg.ui.theme.Laboratorio4UvgTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter") // corrige el error de navihationgraph que tenía
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4UvgTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        AppBar(navController = navController)
                    }
                ) {
                    NavigationGraph(navController = navController)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)// segun w3school esto ayuda
@Composable
fun AppBar(navController: NavHostController) {
    TopAppBar(
        title = { Text("UVG+") },
        actions = {
            IconButton(onClick = {
                navController.navigate("settings")
            }) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "Configuración")
            }

            IconButton(onClick = {
                navController.navigate("profile")
            }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Perfil")
            }
        }
    )
}

@Composable
fun NavigationGraph(navController: NavHostController) { // nuestro builder con navhost
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") {
            TheProfile()
        }
        composable("settings") {
            Settingsapp()
        }
    }
}