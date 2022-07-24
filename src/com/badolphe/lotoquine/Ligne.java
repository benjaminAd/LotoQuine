package com.badolphe.lotoquine;

import com.badolphe.utils.Constantes;

import java.util.HashMap;
import java.util.Set;

public class Ligne {
    private HashMap<String, Boolean> cases;

    public Ligne() {
        this.cases = new HashMap<>();
    }

    public int addElement(String element, int numCase) {
        int isElementAdded = -1;
        if (this.cases.size() < Constantes.CASE_PER_LINE) {
            try {
                int elementInt = Integer.parseInt(element);
                if (numCase <= Constantes.CASE_PER_LINE && (elementInt >= Constantes.QUINE_MIN && elementInt <= Constantes.QUINE_MAX)) {
                    this.cases.put(element, false);
                    isElementAdded = 0;
                }
            } catch (NumberFormatException ignored) {
                if (Constantes.EMPTY_CASE.equals(element)) {
                    this.cases.put(element, false);
                    isElementAdded = -2;
                }
            }
        }
        return isElementAdded;
    }

    public HashMap<String, Boolean> getCases() {
        return this.cases;
    }

    @Override
    public String toString() {
        StringBuilder ligne = new StringBuilder("[");
        Set<String> keys = this.cases.keySet();
        int loop = 0;
        for (String key : keys) {
            loop++;
            ligne.append(key);
            if (loop != keys.size()) {
                ligne.append(", ");
            }
        }
        ligne.append("]");
        return ligne.toString();
    }
}
