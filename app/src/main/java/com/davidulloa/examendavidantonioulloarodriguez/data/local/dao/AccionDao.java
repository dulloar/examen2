package com.davidulloa.examendavidantonioulloarodriguez.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;

import java.util.List;

@Dao
public interface AccionDao {
    @Query("SELECT *FROM acciones")
    LiveData<List<Accion>> getAcciones();
}
