package com.rux.ruchat;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ChatDao {
    @Insert
    void insert(ChatTable table);

    @Query("SELECT chatContent FROM ChatTable")
    List<String> getAllContents();

}
