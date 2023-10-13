package com.example.drewmetapp.ui.feed

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import com.example.drewmetapp.R
import com.example.drewmetapp.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {

    companion object {
        fun newInstance() = FeedFragment()
    }

    private val viewModel: FeedViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val feed = arguments?.getString("feed")
        feed?.let{viewModel.updateFeed(it)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val feed = arguments?.getString("feed")
        val binding = FragmentFeedBinding.inflate(inflater, container, false)
        //val rootView = inflater.inflate(R.layout.fragment_feed,container,false)
        //(viewModel.feed.setData as MutableLiveData).setData
//        feed?.let{
//            //rootView.findViewById<TextView>(R.id.tvFeedType).text = it
//            binding.feedTypeTextView.text = feed
//        }
        //return inflater.inflate(R.layout.fragment_feed, container, false)
        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}