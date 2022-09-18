package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Data osoba[] = new Data[3];
        osoba[0] = new Data("Kamil", "Porębski", "Nowy Sącz", 17, 758422841);
        osoba[1] = new Data("Jan", "Kowalski", "Kraków", 15, 867343424);
        osoba[2] = new Data("Anna", "Nowak", "Wrocław", 21, 732822191);

        for (int i=0; i<osoba.length; i++) {
            System.out.println(osoba[i].getImie() + " - " + osoba[i].getNazwisko() + " - " + osoba[i].getAdres() + " - " + osoba[i].getWiek() + " - " + osoba[i].getNumerTelefonu());
        }
    }
}
