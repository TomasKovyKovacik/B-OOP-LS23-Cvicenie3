package sk.stuba.fei.uim.oop;

public class Auto {
    public static final double PALIVO_NA_KM = 0.5;
    private double stavNadrze;
    private double kapacitaNadrze;
    private boolean ojazdene;

    public Auto() {
        this(50, 100);
    }

    public Auto(double stavNadrze, double kapacitaNadrze){
        this.stavNadrze = stavNadrze;
        this.kapacitaNadrze = kapacitaNadrze;
        this.ojazdene = true;
    }

    public void jazdi(double vzdialenostVKm) {
        stavNadrze = stavNadrze - vzdialenostVKm * PALIVO_NA_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
            System.out.println("Mame prazdnu nadrz");
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public double getKapacitaNadrze() {
        return kapacitaNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public boolean isOjazdene() {
        return ojazdene;
    }

    public void setOjazdene(boolean ojazdene) {
        this.ojazdene = ojazdene;
    }
}
