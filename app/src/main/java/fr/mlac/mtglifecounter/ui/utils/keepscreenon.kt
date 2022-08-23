package fr.mlac.mtglifecounter.ui.utils

import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun KeepScreenOn() = AndroidView({ View(it).apply { keepScreenOn = true } })