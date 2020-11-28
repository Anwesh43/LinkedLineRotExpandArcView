package com.example.linerotexpandarcview

import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.RectF
import android.graphics.Color
import android.view.View
import android.view.MotionEvent

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#673AB7",
    "#009688",
    "#FF9800",
    "#2196F3"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 4.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val rot : Float = 30f
