package com.example.laboratorio4uvg.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4uvg.model.Segmento
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.ui.platform.LocalLayoutDirection
import com.example.laboratorio4uvg.R
import com.example.laboratorio4uvg.data.Datasource

@Composable
fun InformacionCampus(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .verticalScroll(rememberScrollState())
            .padding(bottom = 40.dp)
    ) {
        InfoHeader()
        BannerImage()
        SeccionDestacados()
        SeccionServiciosRecursos()
    }
}

@Composable
fun InfoHeader() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Campus Central",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1f)
                .padding(top = 30.dp, bottom = 20.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            fontSize = 20.sp
        )
    }
}

@Composable
fun BannerImage() {
    Box {
        Image(
            painter = painterResource(R.drawable.img_lab),
            contentDescription = "Laboratorio UVG"
        )
    }
}

@Composable
fun SegmentoCard(segmento: Segmento, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(segmento.imageResourceId),
                contentDescription = stringResource(segmento.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(segmento.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Composable
fun DestacadosGrid(segmentoList: List<Segmento>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(segmentoList) { segmento ->
            SegmentoCard(
                segmento = segmento,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun SeccionDestacados() {
    val layoutDirection = LocalLayoutDirection.current

    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "DESTACADOS",
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .weight(1f)
                .padding(top = 40.dp, start = 10.dp)
                .wrapContentWidth(Alignment.Start),
            fontSize = 20.sp
        )
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing.asPaddingValues().calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing.asPaddingValues().calculateEndPadding(layoutDirection)
            )
    ) {
        DestacadosGrid(
            segmentoList = Datasource().loadSegmentosDestacados()
        )
    }
}

@Composable
fun ServiciosRecursosGrid(segmentoList: List<Segmento>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(segmentoList) { segmento ->
            SegmentoCard(
                segmento = segmento,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun SeccionServiciosRecursos() {
    val layoutDirection = LocalLayoutDirection.current

    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "SERVICIOS Y RECURSOS",
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .weight(1f)
                .padding(top = 40.dp, start = 10.dp)
                .wrapContentWidth(Alignment.Start),
            fontSize = 20.sp
        )
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing.asPaddingValues().calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing.asPaddingValues().calculateEndPadding(layoutDirection)
            )
    ) {
        DestacadosGrid(
            segmentoList = Datasource().loadSegmentosServiciosRecursos()
        )
    }
}
