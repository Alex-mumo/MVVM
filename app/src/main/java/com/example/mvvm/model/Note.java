package com.example.mvvm.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes_table")
public class Note {

    @ColumnInfo(name = "title")
    @PrimaryKey
    @NonNull
    private String title;

    @ColumnInfo(name = "description")
    @Nullable
    private String description;

    public Note(@NonNull String title, String description){
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }
}
