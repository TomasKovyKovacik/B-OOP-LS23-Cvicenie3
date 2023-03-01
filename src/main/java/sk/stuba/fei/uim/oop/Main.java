package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.KeyboardInput;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Main {
    public static void main(String[] args) {
        String meno1 = ZKlavesnice.readString("Zadaj meno");
        System.out.println("Nacitane Meno : " + meno1);
        System.out.println("--------------------------------");
        Double cislo = KeyboardInput.readDouble("Zadaj cislo", 1);
        System.out.println("Nacitane cislo " + cislo);
    }
}
