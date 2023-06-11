package com.mobileSol.zxtole.myviewsapplication.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class CanvasDrawView(context: Context) : View(context) {
    private var size = 320
    private val radius = size / 2f
    private var borderWidth = 4.0f
    private lateinit var paint: Paint
    private lateinit var whitePaint: Paint

    init {
        initView()
    }

    private fun initView() {
        paint = Paint()
        whitePaint = Paint()
        paint.color = Color.BLACK
        whitePaint.color = Color.WHITE
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(
            size / 2f,
            size / 2f,
            radius - borderWidth / 2f,
            paint
        )
        canvas?.drawLine(109f, 150f, 209f, 150f, whitePaint)
    }
}