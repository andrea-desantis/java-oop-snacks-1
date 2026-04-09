package org.snacks.conto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ContoBancario andrea = new ContoBancario(000001);

        System.out.println(andrea.getSaldo());

        andrea.deposita(new BigDecimal(100));
        System.out.println(andrea.getSaldo());
        andrea.preleva(new BigDecimal(30));
        System.out.println(andrea.getSaldo());
    }
}
