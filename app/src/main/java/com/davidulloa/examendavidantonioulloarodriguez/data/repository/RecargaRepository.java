package com.davidulloa.examendavidantonioulloarodriguez.data.repository;

import androidx.lifecycle.LiveData;

import com.davidulloa.examendavidantonioulloarodriguez.AppExecutors;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.AccionDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.RecargaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RecargaRepository {
    private RecargaDao recargaDao;
    private AppExecutors appExecutors;

    @Inject
    RecargaRepository(AppExecutors appExecutors, RecargaDao recargaDao){
        this.appExecutors = appExecutors;
        this.recargaDao = recargaDao;
    }

    public void saveRecarga(Recarga recarga){
        recargaDao.saveRecarga(recarga);
    }
}
