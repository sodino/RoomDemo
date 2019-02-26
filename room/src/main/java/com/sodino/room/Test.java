package com.sodino.room;

import android.content.Context;
import androidx.room.Room;

public class Test {
    public static AppRoom db;

    public static AppRoom instance(Context context) {
        if (db == null) {
            db = Room.databaseBuilder(context, AppRoom.class, "user.db").allowMainThreadQueries().build();
        }
        return db;
    }

}
