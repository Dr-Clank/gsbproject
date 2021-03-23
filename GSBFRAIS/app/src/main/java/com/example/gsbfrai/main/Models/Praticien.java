package com.example.gsbfrai.main.Models;

import java.io.Serializable;

public class Praticien implements Serializable {
    private int id;

    public String getNom() {
        return nom;
    }

    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private String rue;
    private String codePostal;
    private String ville;
    private int coefNotoriete;
    private int metier_id;
    private Metier metier;

    public Praticien(int id, String nom, String prenom, String tel, String mail, String rue, String codePostal, String ville, int coefNotoriete, int metier_id, Metier metier) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.coefNotoriete = coefNotoriete;
        this.metier_id = metier_id;
        this.metier = metier;
    }

    @Override
    public String toString()
    {
        return nom+" "+prenom;
    }
}
