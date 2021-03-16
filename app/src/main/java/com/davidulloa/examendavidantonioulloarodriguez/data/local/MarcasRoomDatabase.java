package com.davidulloa.examendavidantonioulloarodriguez.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.MarcaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;

@Database(entities = {Marca.class}, version = 1, exportSchema = false)
public abstract class MarcasRoomDatabase extends RoomDatabase {
    public abstract MarcaDao MarcaDao();
}
