package com.sodino.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class AppRoom extends RoomDatabase {
    public abstract UserDao userDao();
}
