/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import java.lang.Enum;

/**
 *
 * @author Aleksander
 */
public class NumeryStatkow {

    public enum Statek {

        statek41(6),
        statek42(7),
        statek43(8),
        statek44(9),
        statek31(3),
        statek32(4),
        statek33(5),
        statek21(1),
        statek22(2),
        statek(0),
        statek21g(10),
        statek22g(11),
        statek31g(12),
        statek32g(13),
        statek33g(14),
        statek41g(15),
        statek42g(16),
        statek43g(17),
        statek44g(18),
        drewno(19),
        pudlo(20),
        woda(21),
        statekf(22),
        statek21f(23),
        statek22f(24),
        statek31f(25),
        statek32f(26),
        statek33f(27),
        statek41f(28),
        statek42f(29),
        statek43f(30),
        statek44f(31),
        statek21fg(32),
        statek22fg(33),
        statek31fg(34),
        statek32fg(35),
        statek33fg(36),
        statek41fg(37),
        statek42fg(38),
        statek43fg(39),
        statek44fg(40),
        trafienie(41),
        obroc(42),
        ramka(43),
        f1 (44),
        p1 (45);
        private int statekk;

        private Statek(int statekk) {
            this.statekk = statekk;

        }

        public int getStatekk() {
            return statekk;
        }

        public void setStatek(int statekk) {

            this.statekk = statekk;
        }
    }

}
