package com.davidulloa.examendavidantonioulloarodriguez.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.AccionDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.MarcaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.RecargaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;

@Database(entities = {Marca.class, Accion.class, Recarga.class}, version = 1, exportSchema = false)
public abstract class MarcasRoomDatabase extends RoomDatabase {
    public abstract MarcaDao MarcaDao();
    public abstract RecargaDao recargaDao();
    public abstract AccionDao accionDao();
}
