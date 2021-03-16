package com.davidulloa.examendavidantonioulloarodriguez.data.local.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.android.material.textfield.TextInputLayout;

@Entity(tableName = "acciones")
public class Accion {
    @PrimaryKey
    private int id;
    private String accion;
    private int marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }
}
