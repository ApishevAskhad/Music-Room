package ru.apishev.askhad.musicroom.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.apishev.askhad.musicroom.App
import ru.apishev.askhad.musicroom.databinding.FmtRegistratiopnBinding
import ru.apishev.askhad.musicroom.presentation.viewmodel.RegistrationViewModel
import javax.inject.Inject

internal class RegistrationFragment : Fragment() {

    private var _binding: FmtRegistratiopnBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as App).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FmtRegistratiopnBinding.inflate(inflater, container, false)
        return binding.root
    }

    @Inject
    lateinit var viewModel: RegistrationViewModel

    override fun onStart() {
        super.onStart()
        binding.header.text = viewModel.getHeader()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}