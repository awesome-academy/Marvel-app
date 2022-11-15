package com.ndt.marvelapp.ui.home

import android.view.View
import androidx.navigation.fragment.findNavController
import com.ndt.marvelapp.base.BaseFragment
import com.ndt.marvelapp.base.BaseViewModel
import com.ndt.marvelapp.data.model.Creator
import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.databinding.FragmentHomeBinding
import com.ndt.marvelapp.ui.adapter.CreatorAdapter
import com.ndt.marvelapp.ui.adapter.EventAdapter
import com.ndt.marvelapp.utils.BUNDLE.BUNDLE_CHARACTER
import com.ndt.marvelapp.utils.BUNDLE.BUNDLE_CREATOR
import com.ndt.marvelapp.utils.BUNDLE.BUNDLE_EVENT
import com.ndt.marvelapp.utils.BUNDLE.BUNDLE_SERIES
import com.ndt.marvelapp.utils.BUNDLE.BUNDLE_STORY
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate),
    View.OnClickListener {

    private val eventAdapter = EventAdapter(::clickItemEvent)
    private val creatorAdapter = CreatorAdapter(::clickItemCreator)


    override val viewModel by viewModel<HomeViewModel>()

    override fun initActions() {
        binding.imageButtonEventNext.setOnClickListener(this)
    }

    override fun initData() {
        binding.recyclerEvent.adapter = eventAdapter
        binding.recyclerCreator.adapter = creatorAdapter
    }

    override fun onClick(view: View?) {
        when (view) {
            binding.imageButtonEventNext -> directFragment(BUNDLE_EVENT)
            binding.imageButtonCreatorNext -> directFragment(BUNDLE_CREATOR)
            binding.imageButtonCharacter -> directFragment(BUNDLE_CHARACTER)
            binding.imageButtonStories -> directFragment(BUNDLE_STORY)
            binding.imageButtonSeries -> directFragment(BUNDLE_SERIES)
        }
    }

    private fun directFragment(bundle: String) {
        val action = HomeFragmentDirections.actionHomeFragmentToSeeMoreFragment(bundle)
        findNavController().navigate(action)
    }

    private fun clickItemEvent(event: Event) {
        val action =
            HomeFragmentDirections.actionHomeFragmentToListComicFragment(event.id, BUNDLE_EVENT)
        findNavController().navigate(action)
    }

    private fun clickItemCreator(creator: Creator) {
        val action =
            HomeFragmentDirections.actionHomeFragmentToListComicFragment(creator.id, BUNDLE_CREATOR)
        findNavController().navigate(action)
    }
}
