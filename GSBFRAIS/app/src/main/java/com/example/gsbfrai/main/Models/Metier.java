package com.example.gsbfrai.main.Models;

import java.io.Serializable;

public class Metier implements Serializable {
    private int id;
    private String libelle;

    public Metier(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
}
