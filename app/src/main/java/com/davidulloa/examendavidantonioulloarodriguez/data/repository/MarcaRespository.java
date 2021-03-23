package com.davidulloa.examendavidantonioulloarodriguez.data.repository;

import androidx.lifecycle.LiveData;

import com.davidulloa.examendavidantonioulloarodriguez.AppExecutors;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.MarcaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.RecargaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MarcaRespository {
    private MarcaDao marcaDao;
    private AppExecutors appExecutors;

    @Inject
    MarcaRespository(AppExecutors appExecutors, MarcaDao marcaDao){
        this.appExecutors = appExecutors;
        this.marcaDao = marcaDao;
    }

    public LiveData<List<Marca>> getMarcas(){
        return marcaDao.getmarcass();
    }

    public void savemarca(Marca marca){
        marcaDao.saveMarca(marca);
    }
}
