package com.ndt.marvelapp.ui.detail

import android.graphics.text.LineBreaker
import android.os.Build
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.PagerSnapHelper
import com.ndt.marvelapp.R
import com.ndt.marvelapp.base.BaseFragment
import com.ndt.marvelapp.databinding.FragmentDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : Fragment(R.layout.fragment_detail)
