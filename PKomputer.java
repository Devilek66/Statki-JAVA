/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import java.util.Random;

/**
 *
 * @author Aleksander
 */
public class PKomputer extends Player {

    Random losowy = new Random();
    boolean czyUstawil;

    public PKomputer(int ilemasztow, boolean graCzyUstawia, boolean pokazywac, int wynik) {
        super(ilemasztow, graCzyUstawia, pokazywac, wynik);
        czyUstawil = true;
    }

    public void ustawia() {
        while (czyUstawil) {
            czyUstawil = false;
            ustaw(losowy.nextInt(10), losowy.nextInt(10));

            przekrecenie();
            for (int i = 0; i < 5; i++) {
                if (tablicaStatkow[i] > 0) {
                    czyUstawil = true;
                }
            }
            if (ilemasztow == 0) {
                ilemasztow = 4;
            }
            zmianaNaStatku(ilemasztow--);
        }
    }

    public void jeszczeRazUstawia() {
        czyUstawil = true;
    }

}
