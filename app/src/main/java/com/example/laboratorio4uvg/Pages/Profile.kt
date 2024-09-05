package com.example.laboratorio4uvg.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio4uvg.R


@Composable
fun MyProfileScreen(modifier: Modifier) {
    val navController: NavHostController = rememberNavController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState()).padding(0.dp,0.dp,0.dp,40.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "My Profile",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(top=40.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 20.sp,
            )

            IconButton(
                onClick = {

                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings",
                    tint = Color.Black
                )
            }
        }


        val image = painterResource(id = R.drawable.libros)
        Box(
        ){
            Image(
                painter = image,
                contentDescription="CAMPUS CENTRAL",
                modifier = Modifier
                    .fillMaxWidth()

                    .graphicsLayer(alpha = 1f) // Adjust this alpha to control the image opacity
                    .drawWithContent {
                        drawContent()

                        // Draw a semi-transparent white overlay
                        drawRect(
                            brush = Brush.verticalGradient(
                                colors = listOf(Color.White.copy(alpha = 0.9f), Color.Transparent)
                            )
                        )
                    }

            )
        }

        val imageProfile = painterResource(id = R.drawable.ic_profile_gray)
        Box(
            modifier = Modifier.fillMaxWidth(1f),
            contentAlignment = Alignment.Center,

        ){
            Image(
                painter = imageProfile,
                contentDescription="PERFIL",
                modifier = Modifier.size(200.dp).align(Alignment.Center)
                .offset(y = -100.dp).background(Color.White, shape = CircleShape),

                )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp).offset(y = -100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Audrey Samantha Bhor López",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }

        Sidebar()


    }
}

@Composable
fun Sidebar(){
    Column(
        modifier = Modifier
            .fillMaxWidth(1f).offset(y = -100.dp)
    ) {
        SidebarItem(icon = Icons.Default.Home, text = "My Campus", Color(7, 139, 69)) {
        }
        SidebarItem(icon = Icons.Default.Person, text = "My Friends", Color(0, 119, 182)) {
        }
        SidebarItem(icon = Icons.Default.DateRange, text = "My Calendar", Color(128, 237, 153)) {
        }

        SidebarItem(icon = Icons.Default.AccountBox, text = "My Courses", Color(255, 159, 28)) {
        }

        SidebarItem(icon = Icons.Default.Star, text = "My Grades", Color (7, 59, 76)) {
        }

        SidebarItem(icon = Icons.Default.AccountBox, text = "My Groups", Color(114, 9, 183)) {
        }
        SidebarItem(icon = Icons.Default.DateRange, text = "My Upcoming Events", Color(64, 121, 140)) {
        }
    }
}


@Composable
fun SidebarItem(icon: ImageVector, text: String,color:Color, onItemClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .clickable(onClick = onItemClick)
            .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)

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

    Divider(color = Color(183, 187, 186, 195), thickness = 0.2.dp)
}