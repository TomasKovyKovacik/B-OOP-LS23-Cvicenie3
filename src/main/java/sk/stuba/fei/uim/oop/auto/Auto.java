package sk.stuba.fei.uim.oop.auto;

public class Auto {
    private double stavNadrze;
    private double kapacitaNadrze;
    private boolean ojazdene;

    public void jazdi(double vzdialenostVKm) {
        stavNadrze = stavNadrze - vzdialenostVKm * 0.5;
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
