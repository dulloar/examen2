package com.davidulloa.examendavidantonioulloarodriguez.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;

import java.util.List;

@Dao
public interface RecargaDao {
    @Query("SELECT *FROM recargas")
    LiveData<List<Recarga>> getmarcass();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveRecarga(Recarga recarga);
}
