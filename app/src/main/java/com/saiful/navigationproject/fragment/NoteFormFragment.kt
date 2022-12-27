package com.saiful.navigationproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saiful.navigationproject.R
import kotlinx.android.synthetic.main.fragment_note_form.*

class NoteFormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_note.setOnClickListener {
            show_note_author.text = note_author.text.toString()
            show_note_message.text = note_message.text.toString()

//            reset input field
            note_author.setText("")
            note_message.setText("")
        }
    }
}