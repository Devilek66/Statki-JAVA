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
public class WygrałGracz extends JFrame {

    WygrałGracz() {
        setSize(505, 200);
        setTitle("Wygrałeś!");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel napis1 = new JLabel();
        napis1.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/wygrana.png")));
        napis1.setBounds(0, 0, 500, 200);
        add(napis1);
    }
}
