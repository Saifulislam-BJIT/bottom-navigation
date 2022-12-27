package com.saiful.navigationproject.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.saiful.navigationproject.R
import com.saiful.navigationproject.adapter.NoteListAdapter
import com.saiful.navigationproject.data.Datasource
import kotlinx.android.synthetic.main.fragment_note_list.*

class NoteListFragment : Fragment() {
    private var noteList = Datasource().loadData()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewDisplay()
        setHasOptionsMenu(true)
    }

    private fun recyclerViewDisplay() {
        val recyclerView = node_list_recyclerView
        recyclerView.adapter = NoteListAdapter(noteList)
        recyclerView.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
//        Log.d("TAG", "onCreateOptionsMenu: called")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_clear -> {
                // navigate to settings screen
                noteList = listOf(
                    mapOf("author" to "", "message" to "")
                )
//                Log.d("TAG", "onOptionsItemSelected: called")
                recyclerViewDisplay()
                true
            }
            else -> false
        }
    }
}