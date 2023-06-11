package com.mobileSol.zxtole.myviewsapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import com.mobileSol.zxtole.myviewsapplication.databinding.ActivityMainBinding
import com.mobileSol.zxtole.myviewsapplication.databinding.MyviewBinding
import com.mobileSol.zxtole.myviewsapplication.views.CanvasDrawView
import com.mobileSol.zxtole.myviewsapplication.views.LayoutDrawView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewBinding: MyviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val constraintLayout = binding.root
        setContentView(constraintLayout)

        val firstView = myViewExample()
        constraintLayout.addView(firstView)

        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)

        constraintSet.connect(
            firstView.id,
            ConstraintSet.END,
            constraintLayout.id,
            ConstraintSet.END,
            18
        )
        constraintSet.applyTo(constraintLayout)

        val secondView = CanvasDrawView(this)
        secondView.id = R.id.secondView
        constraintLayout.addView(secondView)

        val thirdView = LayoutDrawView(this)
        thirdView.id = R.id.thirdView
        constraintLayout.addView(thirdView)
    }

    private fun myViewExample(): View {
        myViewBinding = MyviewBinding.inflate(layoutInflater)
        return myViewBinding.root
    }
}