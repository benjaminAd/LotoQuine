package com.badolphe.lotoquine;

import com.badolphe.utils.Constantes;

import java.util.HashMap;

public class Grille {
    private Ligne[] carton;

    public Grille() {
        this.carton = new Ligne[5];
    }

    public Ligne[] getCarton() {
        return carton;
    }



}
