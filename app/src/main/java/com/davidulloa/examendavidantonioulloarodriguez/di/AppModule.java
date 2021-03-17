package com.davidulloa.examendavidantonioulloarodriguez.di;

import android.app.Application;

import androidx.room.Room;

import com.davidulloa.examendavidantonioulloarodriguez.Constants;
import com.davidulloa.examendavidantonioulloarodriguez.api.AuthService;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.MarcasRoomDatabase;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.AccionDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.MarcaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.dao.RecargaDao;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.AuthInterceptor;
import com.davidulloa.examendavidantonioulloarodriguez.util.LiveDataCallAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ViewModelModule.class)
public class AppModule {

    @Singleton
    @Provides
    AuthService provideIncidenciaService(){

        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new AuthInterceptor());
        OkHttpClient cliente = okHttpClientBuilder.build();

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        return new Retrofit.Builder()
                .baseUrl(Constants.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .build()
                .create(AuthService.class);
    }


    @Singleton
    @Provides
    MarcasRoomDatabase provideDB(Application app){
        return Room.databaseBuilder(app,MarcasRoomDatabase.class,"marcasDB").build();
    }

    @Singleton
    @Provides
    MarcaDao providesMarcaDao(MarcasRoomDatabase db){ return db.MarcaDao(); }

    @Singleton
    @Provides
    RecargaDao providesRecargaDao(MarcasRoomDatabase db){ return db.recargaDao(); }

    @Singleton
    @Provides
    AccionDao providesAccionDao(MarcasRoomDatabase db){ return db.accionDao(); }

}
