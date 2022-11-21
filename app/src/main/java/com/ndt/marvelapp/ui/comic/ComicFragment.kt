package com.ndt.marvelapp.ui.comic

import android.app.Dialog
import android.icu.util.Calendar
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.ndt.marvelapp.R
import com.ndt.marvelapp.base.BaseFragment
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.databinding.DialogFilterYearBinding
import com.ndt.marvelapp.databinding.FragmentComicBinding
import com.ndt.marvelapp.ui.adapter.ComicAdapter
import com.ndt.marvelapp.utils.AppContanst.FORMAT_COMIC
import com.ndt.marvelapp.utils.AppContanst.MIN_YEAR
import org.koin.androidx.viewmodel.ext.android.viewModel

class ComicFragment : BaseFragment<FragmentComicBinding>(FragmentComicBinding::inflate) {

    private val comicAdapter = ComicAdapter(::clickItemComic)

    override val viewModel by viewModel<ComicViewModel>()

    override fun setupViews() {
        //not support
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun initActions() {
        binding.btnSearch.setOnClickListener {
            createDialogWithoutDateField()
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun createDialogWithoutDateField() {
        val calendar = Calendar.getInstance()
        val binding = DialogFilterYearBinding.inflate(layoutInflater)
        val dialog = Dialog(requireContext())
        dialog.apply {
            setContentView(binding.root)
            window?.setBackgroundDrawableResource(R.drawable.bg_radius_white)
            val year = calendar[Calendar.YEAR]
            binding.numberPickerYear.minValue = MIN_YEAR
            binding.numberPickerYear.maxValue = calendar.get(Calendar.YEAR)
            binding.numberPickerYear.value = year
            binding.btnSet.setOnClickListener {
                if (binding.editTextChooseYear.text.isEmpty()) {
                    updateComicByYear(binding.numberPickerYear.value)
                } else {
                    updateComicByYear(binding.editTextChooseYear.text.toString().toInt())
                }
                dismiss()
            }
            show()
        }
    }

    private fun updateComicByYear(value: Int) {
        binding.btnSearch.text = value.toString()
        viewModel.getComicByYear(FORMAT_COMIC, value)
    }


    private fun clickItemComic(comic: Comic) {
        val action = comic.id?.let { ComicFragmentDirections.actionComicFragmentToDetailFragment(it) }
        if (action != null) {
            findNavController().navigate(action)
        }
    }

    override fun initData() {
        binding.recyclerComic.adapter = comicAdapter
    }
}
