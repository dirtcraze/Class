package Zadanie3;

class Data {
    private String imie, nazwisko, adres;
    private int wiek, numerTelefonu;

    public Data(String imie, String nazwisko, String adres, int wiek, int numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        this.numerTelefonu = numerTelefonu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }
}
