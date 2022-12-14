package com.farhanfarkaann.finalprojectskripsi.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farhanfarkaann.finalprojectskripsi.R
import com.farhanfarkaann.finalprojectskripsi.databinding.FragmentNoteListingBinding


class NoteListingFragment : Fragment() {
    lateinit var binding : FragmentNoteListingBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}