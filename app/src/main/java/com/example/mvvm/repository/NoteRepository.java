package com.example.mvvm.repository;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.example.mvvm.model.Note;
import com.example.mvvm.model.dao.Notedao;
import com.example.mvvm.model.db.Notedb;

import java.util.List;

public class NoteRepository {

    private Notedao notedao;
    private LiveData<List<Note>> allNotes;

    public NoteRepository(Application application){
        Notedb db = Notedb.getDatabase(application);
        notedao = db.notedao();

        //allNotes = notedao.getAlphabetically();

    }
    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }

    public void insert(Note note){
        notedao.save(note);
    }


}
