package com.ndt.marvelapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.ndt.marvelapp.utils.showToast

typealias Inflate<T> = (LayoutInflater) -> T

abstract class BaseFragment<T : ViewBinding>(private val inflate: Inflate<T>) : Fragment() {

    private var _binding: T? = null
    abstract val viewModel: BaseViewModel
    val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.error.observe(viewLifecycleOwner) {
            view.context.showToast(it)
        }
        setupViews()
        initData()
        initActions()
    }

    abstract fun setupViews()

    abstract fun initActions()

    abstract fun initData()

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
