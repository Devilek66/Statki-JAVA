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
public class Pomoc extends JFrame {

    Pomoc() {
        setSize(505, 250);
        setTitle("Pomoc");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel tlo = new JLabel();
        JLabel napis1 = new JLabel("Zasady gry w statki:");
        JLabel napis2 = new JLabel("1)cos tam");
        JLabel napis3 = new JLabel("2) cos tam");
        JLabel napis4 = new JLabel("3)  cos tam");
        tlo.setBounds(0, 0, 500, 250);
        napis1.setBounds(100, 0, 300, 50);
        napis2.setBounds(100, 50, 300, 50);
        napis3.setBounds(100, 100, 300, 50);
        napis4.setBounds(100, 150, 300, 50);
        tlo.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/fale.png")));
        add(napis1);
        add(napis2);
        add(napis3);
        add(napis4);
        add(tlo);
    }
}
