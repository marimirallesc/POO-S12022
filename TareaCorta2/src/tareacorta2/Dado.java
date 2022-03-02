/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacorta2;

import java.util.Random;

/**
 *
 * @author Mari
 */
public class Dado {

    private int caras;

    Dado(int numCaras) {
        setCaras(numCaras);
    }

    int lanzar() {
        Random random = new Random();
        //random.setSeed(42);
        int range = (getCaras() - 1) + 1;
        
        return (int) (Math.random() * range) + 1;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

}
