package com.jorge.app_google_certification_codelabs.codelabs.core.toastandsnack

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jorge.app_google_certification_codelabs.R
import com.jorge.app_google_certification_codelabs.codelabs.util.showSnack
import com.jorge.app_google_certification_codelabs.codelabs.util.toast
import com.jorge.app_google_certification_codelabs.databinding.FragmentToastSnackBinding

class ToastSnackFragment : Fragment() {

    private var _binding: FragmentToastSnackBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentToastSnackBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToast.setOnClickListener { toast("Apresentação de Toast") }
        binding.btnSnackBar.setOnClickListener { showSnack(binding.textView2,"Apresentação de Snack", Color.CYAN) }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}