package com.testtask.gametesttask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.testtask.gametesttask.R
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MainMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val bundle = Bundle()
        game1Button.setOnClickListener {
            bundle.putString(GAME_TITLE, GAME_1)
            findNavController().navigate(R.id.gameFragment, bundle, null)
        }

        game2Button.setOnClickListener {
            bundle.putString(GAME_TITLE, GAME_2)
            findNavController().navigate(R.id.gameFragment, bundle, null)
        }

        game3Button.setOnClickListener {
            bundle.putString(GAME_TITLE, GAME_3)
            findNavController().navigate(R.id.gameFragment, bundle, null)
        }

        game4Button.setOnClickListener {
            bundle.putString(GAME_TITLE, GAME_4)
            findNavController().navigate(R.id.gameFragment, bundle, null)
        }

        game5Button.setOnClickListener {
            bundle.putString(GAME_TITLE, GAME_5)
            findNavController().navigate(R.id.gameFragment, bundle, null)
        }
    }

    companion object {
        const val GAME_TITLE = "game_id"
        const val GAME_1 = "Game 1"
        const val GAME_2 = "Game 2"
        const val GAME_3 = "Game 3"
        const val GAME_4 = "Game 4"
        const val GAME_5 = "Game 5"
    }
}