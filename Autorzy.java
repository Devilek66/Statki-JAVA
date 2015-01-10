/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Aleksander
 */
public class Autorzy extends JFrame {

    Autorzy() {
        setSize(505, 250);
        setTitle("Autorzy");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel napis1 = new JLabel("Główny programista: Aleksander Pietrzak");
        JLabel napis2 = new JLabel("Jakub Borawski");
        JLabel napis3 = new JLabel("Bartłomiej Dzienia");
        JLabel napis4 = new JLabel("Marek Drzazga");
        JLabel tlo = new JLabel();
        napis1.setBounds(100, 0, 300, 50);
        napis2.setBounds(100, 50, 300, 50);
        napis3.setBounds(100, 100, 300, 50);
        napis4.setBounds(100, 150, 300, 50);
        tlo.setBounds(0, 0, 500, 250);
        tlo.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/fale.png")));
        add(napis1);
        add(napis2);
        add(napis3);
        add(napis4);
        add(tlo);
    }
}
