/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aleksander
 */
public class Wyglad extends JFrame implements ActionListener {

    int czyUstawianieEND;
    /**
     * referencje graczy
     */
    Player gracz;
    PKomputer komputer;
    /**
     * referencje na otrzeby iventa
     */
    JLabel tlo;
    JLabel napisGracz;
    JLabel napisKomputer;
    JLabel wynikGracza;
    JLabel wynikKomputer;
    JLabel myslnik;
    JButton czteroMasztowiec;
    JButton trzyMasztowiec;
    JButton dwuMasztowiec;
    JButton jednoMasztowiec;
    JButton obrot;
    JButton pomoc;
    JButton autorzy;
    JButton nowaGra;
    /**
     * referencje do list
     */
    ArrayList<javax.swing.JButton> tablicaGracza = new ArrayList();
    ArrayList<javax.swing.JButton> tablicaGracza2 = new ArrayList();

    public Wyglad() {
        /**
         * nasi gracze
         */
        czyUstawianieEND = 0;
        gracz = new Player(3, true, true, 0);
        komputer = new PKomputer(4, false, false, 0);
        /**
         * Okno
         */
        setSize(805, 600);
        setResizable(false);
        setLayout(null);
        setTitle("Battle Sea");
        setLocationRelativeTo(null);
        /**
         * dodanie list mapy
         */

        /**
         * dodanie obiektow do list 10x10
         */
        for (int i = 0; i < 100; i++) {
            tablicaGracza.add(new JButton());
            tablicaGracza2.add(new JButton());
        }
        /**
         * label-ki zwiazane z napisami i wynikami tlo
         */
        tlo = new JLabel();
        napisGracz = new JLabel();
        napisKomputer = new JLabel();
        wynikGracza = new JLabel();
        wynikKomputer = new JLabel();
        myslnik = new JLabel();
        czteroMasztowiec = new JButton();
        trzyMasztowiec = new JButton();
        dwuMasztowiec = new JButton();
        jednoMasztowiec = new JButton();
        obrot = new JButton();
        pomoc = new JButton();
        autorzy = new JButton();
        nowaGra = new JButton();
        /**
         * label-ki nowe grafiki i tlo
         */
        tlo.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/TŁO STATKÓW.png")));
        napisGracz.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/gracz.png")));
        napisKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/komputer.png")));
        wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik10.png")));
        wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik20.png")));
        myslnik.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik.png")));
        czteroMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/4.png")));
        trzyMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/3.png")));
        dwuMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/2.png")));
        jednoMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/1.png")));
        obrot.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/obroc.png")));
        pomoc.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/hp.png")));
        autorzy.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/autory.png")));
        nowaGra.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/ng.png")));
        /**
         * label-ki nowe pozycje i tlo
         */
        tlo.setBounds(0, 0, 800, 600);
        napisGracz.setBounds(0, 300, 300, 30);
        napisKomputer.setBounds(500, 300, 300, 30);
        wynikGracza.setBounds(355, 135, 30, 30);
        wynikKomputer.setBounds(415, 135, 30, 30);
        myslnik.setBounds(385, 135, 30, 30);
        czteroMasztowiec.setBounds(30, 390, 30, 120);
        trzyMasztowiec.setBounds(60, 390, 30, 90);
        dwuMasztowiec.setBounds(90, 390, 30, 60);
        jednoMasztowiec.setBounds(120, 390, 30, 30);
        obrot.setBounds(180, 390, 30, 30);
        pomoc.setBounds(355, 90, 90, 30);
        autorzy.setBounds(355, 60, 90, 30);
        nowaGra.setBounds(355, 30, 90, 30);
        /**
         * dodanie labele-k do okna
         */

        add(napisGracz);
        add(napisKomputer);
        add(myslnik);
        add(wynikGracza);
        add(wynikKomputer);
        add(czteroMasztowiec);
        add(trzyMasztowiec);
        add(dwuMasztowiec);
        add(jednoMasztowiec);
        add(obrot);
        add(pomoc);
        add(autorzy);
        add(nowaGra);
        /**
         * eventy na statki i obroc
         */
        obrot.addActionListener(this);
        jednoMasztowiec.addActionListener(this);
        dwuMasztowiec.addActionListener(this);
        trzyMasztowiec.addActionListener(this);
        czteroMasztowiec.addActionListener(this);
        pomoc.addActionListener(this);
        autorzy.addActionListener(this);
        nowaGra.addActionListener(this);

        /**
         * dodanie i zrobie all z guzikami plansz
         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int z = poz(i, j);
                tablicaGracza.get(z).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/woda.png")));
                tablicaGracza2.get(z).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/woda.png")));
                tablicaGracza.get(z).setBounds(j * 30, i * 30, 30, 30);
                tablicaGracza2.get(z).setBounds(500 + j * 30, i * 30, 30, 30);
                add(tablicaGracza.get(z));
                add(tablicaGracza2.get(z));
                tablicaGracza.get(z).addActionListener((ActionListener) this);
                tablicaGracza2.get(z).addActionListener((ActionListener) this);
            }
        }
        /**
         * dodanie tla
         */
        add(tlo);
        komputer.ustawia();
    }

    static int poz(int x, int y) {
        return (x * 10 + y);
    }

    static int rePozx(int i) {
        return i / 10;
    }

    static int rePozy(int i) {
        return i % 10;
    }

    private void ustawianie(Object zrodlo, int i) {

        if (zrodlo == tablicaGracza.get(i)) {
            czyUstawianieEND++;
            gracz.ustaw(rePozx(i), rePozy(i));
            for (int j = 0; j < 100; j++) {
                if (gracz.getTab(rePozx(j), rePozy(j)).getStatekk() != 21) {
                    if (gracz.getTab(rePozx(j), rePozy(j)).getStatekk() < 10) {
                        tablicaGracza.get(j).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + gracz.getTab(rePozx(j), rePozy(j)) + ".png")));

                    }

                    if (gracz.getTab(rePozx(j), rePozy(j)).getStatekk() >= 10) {
                        tablicaGracza.get(j).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + gracz.getTab(rePozx(j), rePozy(j)) + ".png")));
                    }
                }
            }
        }
    }

    private void wygralGracz() {
        WygrałGracz wygralGracz = new WygrałGracz();
        wygralGracz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        wygralGracz.setVisible(true);
        gracz.setWyniki(gracz.getWynik() + 1);
        if (gracz.getWynik() == 1) {
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik11.png")));
        } else if (gracz.getWynik() == 2) {
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik12.png")));
        } else if (gracz.getWynik() == 3) {
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik13.png")));
        } else if (komputer.getWynik() == 4 || gracz.getWynik() == 4) {
            reset();
            gracz.setWyniki(0);
            komputer.setWyniki(0);
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik20.png")));
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik10.png")));

        }
        reset();
    }

    private void wygralKomputer() {
        WygrałKomputer wygralKomputer = new WygrałKomputer();
        wygralKomputer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        wygralKomputer.setVisible(true);
        komputer.setWyniki(komputer.getWynik() + 1);
        if (komputer.getWynik() == 1) {
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik21.png")));
        } else if (komputer.getWynik() == 2) {
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik22.png")));
        } else if (komputer.getWynik() == 3) {
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik23.png")));
        } else if (komputer.getWynik() == 4 || gracz.getWynik() == 4) {
            reset();
            gracz.setWyniki(0);
            komputer.setWyniki(0);
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik20.png")));
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik10.png")));
        }
        reset();
    }

    private void reset() {
        gracz.reset();
        komputer.reset();
        komputer.jeszczeRazUstawia();
        czyUstawianieEND = 0;
        komputer.ustawia();
        czteroMasztowiec.setBounds(30, 390, 30, 120);
        trzyMasztowiec.setBounds(60, 390, 30, 90);
        dwuMasztowiec.setBounds(90, 390, 30, 60);
        jednoMasztowiec.setBounds(120, 390, 30, 30);
        czteroMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/4.png")));
        trzyMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/3.png")));
        dwuMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/2.png")));
        jednoMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/1.png")));
        for (int i = 0; i < 100; i++) {
            tablicaGracza2.get(i).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/woda.png")));
            tablicaGracza.get(i).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + gracz.getTab(rePozx(i), rePozy(i)) + ".png")));
        }
    }

    private void strzelanie(Object zrodlo, int i) {
        if (zrodlo == tablicaGracza2.get(i)) {
            if (komputer.strzal(rePozx(i), rePozy(i))) {

                for (int j = 0; j < 100; j++) {
                    if (komputer.getTab(rePozx(j), rePozy(j)).getStatekk() == 20) {
                        tablicaGracza2.get(j).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + komputer.getTab(rePozx(j), rePozy(j)) + ".png")));

                    }
                    if (komputer.getTab(rePozx(j), rePozy(j)).getStatekk() == 41) {
                        tablicaGracza2.get(j).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + komputer.getTab(rePozx(j), rePozy(j)) + ".png")));
                    }

                }
                if (komputer.getZycie() == 0) {
                    wygralGracz();
                }
                if (czyUstawianieEND >= 10) {
                    gracz.strzalautos();
                    for (int j = 0; j < 100; j++) {
                        tablicaGracza.get(j).setIcon(new ImageIcon(getClass().getResource("/statki/grafika/" + gracz.getTab(rePozx(j), rePozy(j)) + ".png")));
                    }
                }
                if (gracz.getZycie() == 0) {
                    wygralKomputer();
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == obrot) {
            if (gracz.getUstawianie()) {
                czteroMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/4p.png")));
                trzyMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/3p.png")));
                dwuMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/2p.png")));
                jednoMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/p1.png")));

                czteroMasztowiec.setBounds(30, 390, 120, 30);
                trzyMasztowiec.setBounds(30, 420, 90, 30);
                dwuMasztowiec.setBounds(30, 450, 60, 30);
                jednoMasztowiec.setBounds(30, 480, 30, 30);
                gracz.przekrecenie();
            } else {
                czteroMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/4.png")));
                trzyMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/3.png")));
                dwuMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/2.png")));
                jednoMasztowiec.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/1.png")));

                czteroMasztowiec.setBounds(30, 390, 30, 120);
                trzyMasztowiec.setBounds(60, 390, 30, 90);
                dwuMasztowiec.setBounds(90, 390, 30, 60);
                jednoMasztowiec.setBounds(120, 390, 30, 30);
                gracz.przekrecenie();
            }
        } else if (zrodlo == jednoMasztowiec) {
            gracz.zmianaNaStatku(1);
        } else if (zrodlo == dwuMasztowiec) {
            gracz.zmianaNaStatku(2);
        } else if (zrodlo == trzyMasztowiec) {
            gracz.zmianaNaStatku(3);
        } else if (zrodlo == czteroMasztowiec) {
            gracz.zmianaNaStatku(4);
        } else if (zrodlo == pomoc) {
            Pomoc pomoc2 = new Pomoc();
            pomoc2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            pomoc2.setVisible(true);
        } else if (zrodlo == autorzy) {
            Autorzy autorzy2 = new Autorzy();
            autorzy2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            autorzy2.setVisible(true);
        } else if (zrodlo == nowaGra) {
            reset();
            gracz.setWyniki(0);
            komputer.setWyniki(0);
            wynikKomputer.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik20.png")));
            wynikGracza.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wynik10.png")));
        } else {
            for (int i = 0; i < 100; i++) {
                ustawianie(zrodlo, i);
                if (czyUstawianieEND >= 10) {
                    strzelanie(zrodlo, i);
                }
            }
        }
    }
}
