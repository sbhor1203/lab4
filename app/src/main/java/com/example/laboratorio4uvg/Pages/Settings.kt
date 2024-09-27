package com.example.laboratorio4uvg.Pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4uvg.R

@Composable
fun Settingsapp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState()).padding(0.dp,0.dp,0.dp,40.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {


            IconButton(
                onClick = {
                    // Handle icon button click
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                )
            }

            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(top=40.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),

                fontSize = 20.sp,
            )
        }

        SidebarSettings()


    }
}

@Composable
fun SidebarSettings(){
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
    ) {
        SidebarItemSettings(icon = Icons.Default.Person, text = "Edit Profile", Color(64, 66, 65, 255)) {
        }
        SidebarItemSettings(icon = Icons.Default.Email, text = "Email Addresses", Color(128, 237, 153)) {
        }
        SidebarItemSettings(icon = Icons.Default.Notifications, text = "Notifications", Color(255, 159, 28)) {
        }

        SidebarItemSettings(icon = Icons.Default.Lock, text = "Privacy", Color(64, 66, 65, 255)) {
        }

        Divider(color = Color(228, 231, 230, 195), thickness = 20.dp)


        SidebarItemSettings(icon = Icons.Default.Warning, text = "Help & Feedback", Color(220, 76, 100)) {
        }

        SidebarItemSettings(icon = Icons.Default.Info, text = "About", Color(59, 113, 202)) {
        }

        Divider(color = Color(228, 231, 230, 195), thickness = 20.dp)

        SidebarItemSettings(icon = Icons.Default.ExitToApp, text = "Logout", Color(220, 76, 100)) {
        }

    }
}


@Composable
fun SidebarItemSettings(icon: ImageVector, text: String, color:Color, onItemClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .clickable(onClick = onItemClick)
            .padding(start = 16.dp, top = 20.dp, bottom = 20.dp)

    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = color
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }

    Divider(color = Color.Gray, thickness = 0.2.dp)
}