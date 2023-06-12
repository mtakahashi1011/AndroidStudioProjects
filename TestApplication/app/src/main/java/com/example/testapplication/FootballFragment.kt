package com.example.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.testapplication.databinding.FragmentFootballBinding

class FootballFragment : Fragment() {

    private lateinit var binding: FragmentFootballBinding

    private val viewModel = FootballViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // DataBindingを使用しない場合は以下のようにする
        // return inflater.inflate(R.layout.fragment_football, container, false)
        // DataBindingの初期化は以下のようにしても良い
        // binding = DataBindingUtil.inflate<FragmentFootballBinding>(inflater, container, false)
        binding = FragmentFootballBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.editText.addTextChangedListener { text ->
            viewModel.updateButton(text.isNullOrBlank())
        }
        binding.button.setOnClickListener {
            val text = binding.editText.text.toString()
            viewModel.submitText(text)
        }
    }
}