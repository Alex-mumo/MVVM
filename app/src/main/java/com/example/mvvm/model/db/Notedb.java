package com.example.mvvm.model.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.mvvm.model.dao.Notedao;
import com.example.mvvm.model.Note;

@Database(entities = {Note.class}, exportSchema = false, version = 1)
public abstract class Notedb extends RoomDatabase {

    public abstract Notedao notedao();

    private static volatile Notedb INSTANCE;

    public static Notedb getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (Notedb.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Notedb.class, "note_db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
