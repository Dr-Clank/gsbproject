package com.example.gsbfrai.main.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Praticiens implements Serializable {
    public List<Praticien> getPraticiens() {
        return praticiens;
    }

    public void setPraticiens(List<Praticien> praticiens) {
        this.praticiens = praticiens;
    }

    private List<Praticien> praticiens;


}
