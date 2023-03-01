package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.setKapacitaNadrze(100);
        a.setStavNadrze(100);

        System.out.println(a.getStavNadrze());
        a.jazdi(100);
        System.out.println(a.getStavNadrze());
    }
}
