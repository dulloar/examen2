package com.davidulloa.examendavidantonioulloarodriguez.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;

import java.util.List;

@Dao
public interface MarcaDao {
    @Query("SELECT *FROM marcas")
    LiveData<List<Marca>> getmarcass();
}
