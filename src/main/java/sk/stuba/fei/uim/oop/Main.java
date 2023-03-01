package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        Vozidlo bycikel = new Vozidlo("BMX", 2);
        Auto skodofka = new Auto("Skodovka", 4, "120ls");

        bycikel.truba();
        skodofka.truba();
    }
}
