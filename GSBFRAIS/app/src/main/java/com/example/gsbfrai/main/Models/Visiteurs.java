package com.example.gsbfrai.main.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Visiteurs implements Serializable {
    public List<Visiteur> getVisiteurs() {
        return visiteurs;
    }

    public void setVisiteurs(List<Visiteur> visiteurs) {
        this.visiteurs = visiteurs;
    }

    private List<Visiteur> visiteurs;


}