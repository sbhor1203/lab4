package com.example.laboratorio4uvg.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Segmento(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
