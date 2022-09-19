package Zadanie14;

public class Procedure {
    private String nazwaBadania, dataBadania, namePrzepro;
    double oplata;

    public Procedure(String nazwaBadania, String dataBadania, String namePrzepro, double oplata) {
        this.nazwaBadania = nazwaBadania;
        this.dataBadania = dataBadania;
        this.namePrzepro = namePrzepro;
        this.oplata = oplata;
    }

    public String getNazwaBadania() {
        return nazwaBadania;
    }

    public void setNazwaBadania(String nazwaBadania) {
        this.nazwaBadania = nazwaBadania;
    }

    public String getDataBadania() {
        return dataBadania;
    }

    public void setDataBadania(String dataBadania) {
        this.dataBadania = dataBadania;
    }

    public String getNamePrzepro() {
        return namePrzepro;
    }

    public void setNamePrzepro(String namePrzepro) {
        this.namePrzepro = namePrzepro;
    }

    public double getOplata() {
        return oplata;
    }

    public void setOplata(double oplata) {
        this.oplata = oplata;
    }
}
