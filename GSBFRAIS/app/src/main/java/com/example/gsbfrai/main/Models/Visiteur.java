package com.example.gsbfrai.main.Models;

import java.io.Serializable;

public class Visiteur implements Serializable {
    private int id;

    public Visiteur(int id, String matricule, String username, String nom, String prenom, String tel, String mail) {
        this.id = id;
        this.matricule = matricule;
        this.username = username;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    private String matricule;
    private String username;
    private String nom;
    private String prenom;
    private String tel;
    private String mail;

    @Override
    public String toString()
    {
        return nom+" "+prenom;
    }
}
