package com.example.mvvm.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.example.mvvm.model.Note;

import java.util.List;

@Dao
public interface Notedao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(Note note);

    @Query("DELETE FROM notes_table")
    void deleteAll();

    //@Query("SELECT *FROM notes_table ORDER BY note ASC")
    //LiveData<List<Note>> getAlphabetically();

}
