package com.ndt.marvelapp.ui.listcomic

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.ndt.marvelapp.base.BaseFragment
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.databinding.FragmentListComicBinding
import com.ndt.marvelapp.ui.adapter.ComicAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListComicFragment :
    BaseFragment<FragmentListComicBinding>(FragmentListComicBinding::inflate) {

    override val viewModel by viewModel<ListComicViewModel>()
    private val args: ListComicFragmentArgs by navArgs()
    private val comicAdapter = ComicAdapter(::clickItemComic)

    override fun setupViews() {
        //not support
    }

    override fun initActions() {
        binding.toolBarBack.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun initData() {
        binding.recyclerComic.adapter = comicAdapter
        viewModel.getComicsByType(args.type, args.id)
    }

    private fun clickItemComic(comic: Comic) {
        val action = ListComicFragmentDirections.actionListComicFragmentToDetailFragment(comic.id)
        findNavController().navigate(action)
    }
z
}
