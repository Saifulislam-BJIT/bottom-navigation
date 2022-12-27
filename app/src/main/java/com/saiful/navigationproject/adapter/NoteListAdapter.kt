package com.saiful.navigationproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.saiful.navigationproject.R
import kotlinx.android.synthetic.main.list_view.view.*

// Adapter for the [RecyclerView] in [NoteListFragment].
class NoteListAdapter(private val noteList: List<Map<String, String>>) :
    RecyclerView.Adapter<NoteListAdapter.NoteListViewHolder>() {

    class NoteListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val showNoteAuthor: TextView = view.show_note_author
        val showNoteMessage: TextView = view.show_note_message
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_view, parent, false)
        return NoteListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NoteListViewHolder, position: Int) {
        val noteAuthor = noteList[position]["author"].toString()
        val noteMessage = noteList[position]["message"].toString()
        holder.showNoteAuthor.text = noteAuthor.replaceFirstChar { it.uppercase() }
        holder.showNoteMessage.text = noteMessage.replaceFirstChar { it.uppercase() }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}