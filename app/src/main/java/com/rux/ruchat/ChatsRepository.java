package com.rux.ruchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ChatTable.class}, version = 1)
abstract class AppDatabase extends RoomDatabase {
   public abstract ChatDao userDao();
}
public class ChatsRepository {
   private AppDatabase db;

   ChatsRepository(AppCompatActivity app) {
      db = Room.databaseBuilder(app.getApplicationContext(), AppDatabase.class, "chat_1").build();
   }
}

@Entity
 class ChatTable{
    @PrimaryKey
    public int chatID;

    @ColumnInfo(name="fromUserId")
    public int fromUserId;

    @ColumnInfo(name="toUserId")
    public int toUserId;

    @ColumnInfo(name="chatContent")
    public String chatContent;

}




