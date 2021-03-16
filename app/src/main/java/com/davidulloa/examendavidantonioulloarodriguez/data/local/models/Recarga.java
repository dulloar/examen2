package com.davidulloa.examendavidantonioulloarodriguez.data.local.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "recargas")
public class Recarga {
    @PrimaryKey
    private int id;
    private int numero;
    private double monto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
