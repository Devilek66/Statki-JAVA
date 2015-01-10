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
public class Player {

    Random losowy = new Random();
    int zycie;
    int wynik;
    NumeryStatkow.Statek tab[][] = new NumeryStatkow.Statek[12][12];
    int ilemasztow;
    int tablicaStatkow[] = new int[5];
    boolean graCzyUstawia;
    boolean ustawienie;
    boolean pokazywac;

    public Player(int ilemasztow, boolean graCzyUstawia, boolean pokazywac, int wynik) {
        this.zycie = 20;
        this.ilemasztow = ilemasztow;
        this.graCzyUstawia = graCzyUstawia;
        this.ustawienie = true;
        tablicaStatkow[1] = 4;
        tablicaStatkow[2] = 3;
        tablicaStatkow[3] = 2;
        tablicaStatkow[4] = 1;
        this.wynik = wynik;
        this.pokazywac = pokazywac;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tab[i][j] = NumeryStatkow.Statek.woda;
            }
        }
    }

    public void setWyniki(int wynik) {
        this.wynik = wynik;
    }

    public int getWynik() {
        return wynik;
    }

    public NumeryStatkow.Statek getTab(int x, int y) {
        return tab[x + 1][y + 1];
    }

    public int getZycie() {
        return zycie;
    }

    void zmniejszIloscStatkow(int s) {
        tablicaStatkow[s]--;
    }

    public void strzalautos() {
        boolean z = false;
        while (!z) {
            z = strzal(losowy.nextInt(10), losowy.nextInt(10));
        }
    }

    public void reset() {
        this.zycie = 20;
        this.ustawienie = true;
        tablicaStatkow[1] = 4;
        tablicaStatkow[2] = 3;
        tablicaStatkow[3] = 2;
        tablicaStatkow[4] = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tab[i][j] = NumeryStatkow.Statek.woda;
            }
        }
    }

    boolean strzal(int x, int y) {
        int z;
        int xa = x + 1;
        int ya = y + 1;
        if (tab[xa][ya].getStatekk() < 19 || tab[xa][ya].getStatekk() == 21 || tab[xa][ya].getStatekk() == 45) {
            if (tab[xa][ya] == NumeryStatkow.Statek.woda) {
                tab[xa][ya] = NumeryStatkow.Statek.pudlo;
            }
            if (pokazywac) {
                if (tab[xa][ya].getStatekk() == 0) {
                    tab[xa][ya] = NumeryStatkow.Statek.statekf;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 1) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek21f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 2) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek22f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 3) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek31f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 4) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek32f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 5) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek33f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 6) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek41f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 7) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek42f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 8) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek43f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 9) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek44f;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 10) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek21fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 11) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek22fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 12) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek31fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 13) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek32fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 14) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek33fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 15) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek41fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 16) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek42fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 17) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek43fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 18) {
                    tab[xa][ya] = NumeryStatkow.Statek.statek44fg;
                    zycie--;
                }
                if (tab[xa][ya].getStatekk() == 45) {
                    tab[xa][ya] = NumeryStatkow.Statek.f1;
                    zycie--;
                }
            } else {
                if (tab[xa][ya].getStatekk() < 19 || tab[xa][ya].getStatekk() == 45) {
                    tab[xa][ya] = NumeryStatkow.Statek.trafienie;
                    zycie--;
                }

            }
            return true;
        }
        return false;
    }

    public void setZycie(int zycie) {
        this.zycie = zycie;
    }

    boolean ustaw(int xa, int ya) {
        int x = xa + 1;
        int y = ya + 1;
        boolean czy = true;
        if (tablicaStatkow[ilemasztow] > 0) {
            if (ustawienie) {
                for (int i = 0; i < ilemasztow; i++) {

                    if (!(czy && sprawdzenieObwoduPozycji(x + i, y))) {
                        czy = false;
                    }

                }
                if (czy) {
                    if (ilemasztow == 1 && x < 11) {
                        tablicaStatkow[ilemasztow]--;

                        tab[x][y] = NumeryStatkow.Statek.statek;

                    }
                    if (ilemasztow == 2 && x < 10) {
                        tablicaStatkow[ilemasztow]--;

                        tab[x][y] = NumeryStatkow.Statek.statek21;
                        tab[x + 1][y] = NumeryStatkow.Statek.statek22;

                    }
                    if (ilemasztow == 3 && x < 9) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.statek31;
                        tab[x + 1][y] = NumeryStatkow.Statek.statek32;
                        tab[x + 2][y] = NumeryStatkow.Statek.statek33;

                    }
                    if (ilemasztow == 4 && x < 8) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.statek41;
                        tab[x + 1][y] = NumeryStatkow.Statek.statek42;
                        tab[x + 2][y] = NumeryStatkow.Statek.statek43;
                        tab[x + 3][y] = NumeryStatkow.Statek.statek44;
                    }
                }
            } else {
                for (int i = 0; i < ilemasztow; i++) {
                    if (!(czy && sprawdzenieObwoduPozycji(x, y + i))) {
                        czy = false;
                    }
                }
                if (czy) {
                    if (ilemasztow == 1 && y < 11) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.p1;

                    }
                    if (ilemasztow == 2 && y < 10) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.statek22g;
                        tab[x][y + 1] = NumeryStatkow.Statek.statek21g;
                    }
                    if (ilemasztow == 3 && y < 9) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.statek33g;
                        tab[x][y + 1] = NumeryStatkow.Statek.statek32g;
                        tab[x][y + 2] = NumeryStatkow.Statek.statek31g;

                    }
                    if (ilemasztow == 4 && y < 8) {
                        tablicaStatkow[ilemasztow]--;
                        tab[x][y] = NumeryStatkow.Statek.statek44g;
                        tab[x][y + 1] = NumeryStatkow.Statek.statek43g;
                        tab[x][y + 2] = NumeryStatkow.Statek.statek42g;
                        tab[x][y + 3] = NumeryStatkow.Statek.statek41g;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }

    void przekrecenie() {
        if (ustawienie) {
            ustawienie = false;
        } else {
            ustawienie = true;
        }
    }

    void zmianaNaStatku(int ilemasztow) {
        if (!(tablicaStatkow[ilemasztow] == 0)) {
            this.ilemasztow = ilemasztow;
        }
    }

    boolean koniecUstawiania() {
        for (int i = 1; i < 5; i++) {
            if (tablicaStatkow[i] == 0) {
                graCzyUstawia = false;
                return false;
            }
        }
        graCzyUstawia = true;
        return true;
    }

    boolean sprawdzenieObwoduPozycji(int x, int y) {

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x < 11 && y < 11) {
                    if (tab[x + i][y + j].getStatekk() != 21) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean getUstawianie() {
        return ustawienie;
    }
}
