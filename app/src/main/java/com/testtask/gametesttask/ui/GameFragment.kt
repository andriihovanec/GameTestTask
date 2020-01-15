package com.testtask.gametesttask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testtask.gametesttask.R
import com.testtask.gametesttask.ui.MainMenuFragment.Companion.GAME_TITLE
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : Fragment() {

    private lateinit var rvItems: RecyclerView
    private lateinit var adapter: GameAdapter
    private lateinit var listItems: ArrayList<String>
    private var gameTitle: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        rvItems = view.findViewById(R.id.gameRecyclerView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gameTitle = arguments?.getString(GAME_TITLE).toString()
        tvGameNumber.text = gameTitle
        initList()
        initRecyclerView()
        handleClick()
    }

    private fun initList() {
        listItems = ArrayList()
        listItems.add("#e4b6f0")
        listItems.add("#ba4bab")
        listItems.add("#f69b29")
        listItems.add("#0c939f")
        listItems.add("#78f9ef")
        listItems.add("#008080")
        listItems.add("#fafdcc")
        listItems.add("#d2ea9d")
        listItems.add("#cead9f")
        listItems.add("#686ae5")
        listItems.add("#769df2")
        listItems.add("#ffffd1")
        listItems.add("#feff99")
        listItems.add("#feff54")
        listItems.add("#689F38")
    }

    private fun handleClick() {
        ivGameBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnShuffle.setOnClickListener {
            listItems.shuffle()
            adapter = GameAdapter(listItems, context!!)
            rvItems.swapAdapter(adapter, true)
        }
    }

    private fun initRecyclerView() {
        rvItems = activity!!.findViewById(R.id.gameRecyclerView)
        val gridLayoutManager = GridLayoutManager(context!!, 3)
        rvItems.layoutManager = gridLayoutManager
        adapter = GameAdapter(listItems, context!!)
        rvItems.adapter = adapter
    }
}