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
public interface MarcaDao {
    @Query("SELECT *FROM marcas")
    LiveData<List<Marca>> getmarcass();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveMarca(Marca marca);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveMarcas(Marca... marca);
}
