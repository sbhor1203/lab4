package com.example.laboratorio4uvg.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4uvg.R

@Composable
fun PantallaEmergencias(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .verticalScroll(rememberScrollState())
            .padding(bottom = 40.dp)
    ) {
        EmergenciasHeader(modifier)
        EmergenciasRow()
        EmergenciasButton()
        ClinicaRow()
        ClinicaButton()
    }
}

@Composable
fun EmergenciasHeader(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState())
            .padding(0.dp, 0.dp, 0.dp, 40.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { /* TODO */ },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                )
            }

            Text(
                text = "Emergency Contacts",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 40.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),

                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun EmergenciasRow() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.img_emergencia),
            contentDescription = "Emergencias",
            modifier = Modifier
                .fillMaxWidth()
        )
        Column {
            Text(
                text = "Emergencias",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 20.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 20.sp
            )
            Text(
                text = stringResource(id = R.string.desc_emergencias),
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 10.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun EmergenciasButton() {
    Button(
        onClick = { /* TODO */ },
        contentPadding = ButtonDefaults.ButtonWithIconContentPadding
    ) {
        Icon(
            Icons.Default.Phone,
            contentDescription = null,
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            text = stringResource(id = R.string.num_emergencias),
            textAlign = TextAlign.Left,
            modifier = Modifier
                .weight(1f)
                .padding(top = 10.dp)
        )
    }

    HorizontalDivider(color = Color(183, 187, 186, 195), thickness = 0.2.dp)
}

@Composable
fun ClinicaRow() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.img_clinica),
            contentDescription = "Clínica UVG",
            modifier = Modifier
                .fillMaxWidth()
        )
        Column {
            Text(
                text = "Clínica UVG",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 20.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 20.sp
            )
            Text(
                text = stringResource(id = R.string.desc_clinica),
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 10.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun ClinicaButton() {
    Button(
        onClick = { /* TODO */ },
        contentPadding = ButtonDefaults.ButtonWithIconContentPadding
    ) {
        Icon(
            Icons.Default.Phone,
            contentDescription = null,
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            text = stringResource(id = R.string.num_clinica),
            textAlign = TextAlign.Left,
            modifier = Modifier
                .weight(1f)
                .padding(top = 10.dp)
        )
    }

    HorizontalDivider(color = Color(183, 187, 186, 195), thickness = 0.2.dp)
}