package com.jorge.app_google_certification_codelabs.codelabs.mainfragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jorge.app_google_certification_codelabs.R
import com.jorge.app_google_certification_codelabs.codelabs.util.navTo
import com.jorge.app_google_certification_codelabs.codelabs.util.showSnack
import com.jorge.app_google_certification_codelabs.codelabs.util.toast
import com.jorge.app_google_certification_codelabs.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToast.setOnClickListener { navTo(R.id.action_navigation_home_to_toastSnackFragment) }
        binding.btnNotifications.setOnClickListener { navTo(R.id.action_navigation_home_to_notificationFragment) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}