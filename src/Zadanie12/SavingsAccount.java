package Zadanie12;

public class SavingsAccount {
    private int liczbaMsc;

    private double RSO, stanKonta, zdeponowaneSrodki = 0, wyplaconeSrodki = 0,  odsetki = 0;
    private double zdeponowaneSrodkiSuma = 0, wyplaconeSrodkiSuma = 0, odsetkiSuma = 0;

    public SavingsAccount(int RSO, int stanKonta, int liczbaMsc) {
        this.RSO = RSO;
        this.stanKonta = stanKonta;
        this.liczbaMsc = liczbaMsc;
    }

    public double miesiecznyZyskZOdsetek() {
        stanKonta += zdeponowaneSrodki;
        stanKonta -= wyplaconeSrodki;
        odsetki = RSO/100.0/12 * stanKonta;
        odsetkiSuma += odsetki;
        stanKonta += odsetki;
        return stanKonta;
    }

    public double getOdsetkiSuma() {
        return odsetkiSuma;
    }

    public void setZdeponowaneSrodki(double zdeponowaneSrodki) {
        this.zdeponowaneSrodki = zdeponowaneSrodki;
        this.zdeponowaneSrodkiSuma +=zdeponowaneSrodki;
    }

    public void setWyplaconeSrodki(double wyplaconeSrodki) {
        this.wyplaconeSrodki = wyplaconeSrodki;
        this.wyplaconeSrodkiSuma +=wyplaconeSrodki;
    }

    public double getWyplaconeSrodkiSuma() {
        return wyplaconeSrodkiSuma;
    }

    public double getZdeponowaneSrodkiSuma() {
        return zdeponowaneSrodkiSuma;
    }
}
