/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Aleksander
 */
public class KoniecGry extends JFrame {

    KoniecGry() {
        setSize(505, 100);
        setTitle("Koniec Gry");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel napis1 = new JLabel("Koniec Gry");
        napis1.setBounds(100, 0, 300, 50);
        add(napis1);

    }
}
