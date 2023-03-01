package sk.stuba.fei.uim.oop;

public class Vozidlo {
    protected String znacka;
    protected int pocetKolies;

    public Vozidlo(String znacka, int pocetKolies) {
        this.znacka = znacka;
        this.pocetKolies = pocetKolies;
    }

    public void truba() {
        System.out.println("TUTUUUU");
    }
}
