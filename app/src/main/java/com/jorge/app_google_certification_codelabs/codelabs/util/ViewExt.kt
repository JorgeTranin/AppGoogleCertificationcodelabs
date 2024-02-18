package com.jorge.app_google_certification_codelabs.codelabs.util

import android.view.View
import android.view.animation.Animation
import androidx.core.view.isVisible

fun View.startAnimation(anim: Animation, onEnd: () -> Unit) {
    anim.setAnimationListener(object : Animation.AnimationListener{
        override fun onAnimationStart(anim: Animation?) = onEnd()

        override fun onAnimationEnd(anim: Animation?) = Unit

        override fun onAnimationRepeat(anim: Animation?) = Unit

    })
}

fun View.setVisible(show: Boolean){
    if (show) this.visibility = View.VISIBLE else this.visibility = View.GONE
}