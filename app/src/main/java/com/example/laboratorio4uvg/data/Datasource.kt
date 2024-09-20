package com.example.laboratorio4uvg.data

import com.example.laboratorio4uvg.R
import com.example.laboratorio4uvg.model.Segmento

class Datasource() {
    fun loadSegmentosDestacados(): List<Segmento> {
        return listOf<Segmento>(
            Segmento(R.string.segmentoSN, R.drawable.img_icono_sn),
            Segmento(R.string.segmentoActualidad, R.drawable.img_actualidad_uvg))
    }

    fun loadSegmentosServiciosRecursos(): List<Segmento> {
        return listOf<Segmento>(
            Segmento(R.string.segmentoDirectorio, R.drawable.img_directorio_servicios),
            Segmento(R.string.segmentoPortal, R.drawable.img_portal_bibliotecas))
    }
}