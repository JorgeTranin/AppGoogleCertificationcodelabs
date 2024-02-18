package com.jorge.app_google_certification_codelabs.codelabs.util

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

fun Fragment.navTo(@IdRes dest: Int) = findNavController().navigate(dest)
fun Fragment.navTo(@IdRes dest: Int, args: Bundle) = findNavController().navigate(dest, args)
fun Fragment.toast(msg: String) = Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()

fun Fragment.showSnack(view: View, msg: String, colorBackgroud:Int) = Snackbar.make(view, msg, Snackbar.LENGTH_LONG).setBackgroundTint(colorBackgroud).show()