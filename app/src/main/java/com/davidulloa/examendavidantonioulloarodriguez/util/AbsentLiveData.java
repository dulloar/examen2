package com.davidulloa.examendavidantonioulloarodriguez.util;

import androidx.lifecycle.LiveData;

public class AbsentLiveData extends LiveData {

    private AbsentLiveData(){
        postValue(null);
    }

    public static <T> LiveData<T> create(){
        return new com.davidulloa.examendavidantonioulloarodriguez.util.AbsentLiveData();
    }
}
