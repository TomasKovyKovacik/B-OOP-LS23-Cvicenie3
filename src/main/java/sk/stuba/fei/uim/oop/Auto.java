package sk.stuba.fei.uim.oop;

public class Auto extends Vozidlo {
    protected String nazovModelu;

    public Auto(String znacka, int pocetKolies, String nazovModelu) {
        super(znacka, pocetKolies);
    }

    @Override
    public void truba() {
        System.out.println("TUtututut");
    }
}
