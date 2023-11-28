package com.example.zhibek_romanbekova_hw6_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zhibek_romanbekova_hw6_3m.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding:FragmentFirstBinding
    private lateinit var flowersList:ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = FlowersAdapter(flowersList)
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
        flowersList = ArrayList()
        flowersList.add("Rose")
        flowersList.add("Lily")
        flowersList.add("Popy")
        flowersList.add("Aster")
        flowersList.add("Gladiolus")
        flowersList.add("Iris")
        flowersList.add("Sunflower")
        flowersList.add("Azalea")
        flowersList.add("Cornflower")
        flowersList.add("Hydrangea")
        flowersList.add("Camellia")
        flowersList.add("Pansy")
        flowersList.add("Marigold")
        flowersList.add("Bluebell")
    }

}