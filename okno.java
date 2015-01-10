/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import javax.swing.*;

/**
 *
 * @author Aleksander
 */
public class okno {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Start start = new Start();
        Wyglad okno = new Wyglad();

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        start.setVisible(true);
        Thread.sleep(5000);
        start.dispose();

        okno.setVisible(true);

    }

}
