package com.example.mvvm.ui;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.mvvm.model.Note;
import com.example.mvvm.repository.NoteRepository;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {

    private NoteRepository noteRepository;

    private LiveData<List<Note>> allNotes;

    public NoteViewModel(Application application) {
        super(application);
        noteRepository = new NoteRepository(application);
        allNotes = noteRepository.getAllNotes();

    }
    LiveData<List<Note>> getAllNotes(){
        return getAllNotes();
    }
    public void insert(Note note){
        noteRepository.insert(note);
    }
}
