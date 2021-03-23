package com.davidulloa.examendavidantonioulloarodriguez.viewmodel;

import androidx.lifecycle.ViewModel;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Marca;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;
import com.davidulloa.examendavidantonioulloarodriguez.data.repository.MarcaRespository;
import com.davidulloa.examendavidantonioulloarodriguez.data.repository.RecargaRepository;

import javax.inject.Inject;

public class MarcaViewModel extends ViewModel {
    private MarcaRespository repository;

    @Inject
    public MarcaViewModel(MarcaRespository repository) {
        this.repository = repository;
    }

    public void GuardarRecarga(Marca marca){
        this.repository.savemarca(marca);
    }
}
