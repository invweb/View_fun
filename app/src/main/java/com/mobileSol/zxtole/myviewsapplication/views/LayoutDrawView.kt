package com.mobileSol.zxtole.myviewsapplication.views

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.mobileSol.zxtole.myviewsapplication.R

class LayoutDrawView constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        initView()
    }

    private fun initView() {
        inflate(context, R.layout.myview_layout, this)
    }
}