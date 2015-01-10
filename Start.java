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
public class Start extends JFrame {

    Start() {
        setSize(805, 600);
        setTitle("Battle Sea");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel tlo = new JLabel();
        tlo.setIcon(new ImageIcon(getClass().getResource("/statki/grafika/BATTLE SEA.png")));
        tlo.setBounds(0, 0, 800, 600);
        add(tlo);
    }
}
