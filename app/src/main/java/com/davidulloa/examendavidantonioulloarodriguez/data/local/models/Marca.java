package com.davidulloa.examendavidantonioulloarodriguez.data.local.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "marcas")
public class Marca {
    @Expose
    @SerializedName("id")
    @PrimaryKey
    private int id;
    @Expose
    @SerializedName("marca")
    private String marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
