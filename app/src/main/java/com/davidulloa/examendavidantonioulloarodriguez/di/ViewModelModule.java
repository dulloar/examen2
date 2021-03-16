package com.davidulloa.examendavidantonioulloarodriguez.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.MarcaViewModel;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {

    @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(MarcaViewModel.class)
    abstract ViewModel bindMarcaViewModel(MarcaViewModel entronqueViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
