package com.davidulloa.examendavidantonioulloarodriguez.data.repository;

import androidx.lifecycle.LiveData;

import com.davidulloa.examendavidantonioulloarodriguez.AppExecutors;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.AccionDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;

import java.util.List;

import javax.inject.Inject;

public class AccionRepository {
    private AccionDao accionesDao;
    private AppExecutors appExecutors;

    @Inject
    AccionRepository(AppExecutors appExecutors, AccionDao accionesDao){
        this.appExecutors = appExecutors;
        this.accionesDao = accionesDao;
    }

    public LiveData<List<Accion>> getAcciones(){
        return accionesDao.getAcciones();
    }
}
