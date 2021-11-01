package com.example.mvvm.ui.adapters;


import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.mvvm.model.Note;

public class NoteListAdapter extends ListAdapter<Note , NoteRecyclerView> {

    protected NoteListAdapter(@NonNull DiffUtil.ItemCallback<Note> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public NoteRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteRecyclerView holder, int position) {

    }
}
}
