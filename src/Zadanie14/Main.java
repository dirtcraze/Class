package Zadanie14;

public class Main {
    public static void main(String[] args) {
        int sumaOplat = 0;

        Patient pacjent[] = new Patient[3];
        Procedure badanie[] = new Procedure[3];

        pacjent[0] = new Patient("Kamil Porębski", "Nowy Sącz","Jan Kowalski", 577111535);
        pacjent[1] = new Patient("Michał Tokarczyk", "Katowice","Anna Nowak", 882301732);
        pacjent[2] = new Patient("Maciej Dudek", "Warszawa","Jerzy Kacpiński", 574216481);

        badanie[0] = new Procedure("Badanie fizykalne", "19/09/2022", "dr Iwicki", 250);
        badanie[1] = new Procedure("Zdjęcie rentgenowskie", "19/09/2022", "dr Jaracz", 500);
        badanie[2] = new Procedure("Badanie krwi", "19/09/2022", "dr Szymczak", 200);

        for (int i=0;i< badanie.length;i++) {
            System.out.println(pacjent[i].getName() + " - " + pacjent[i].getAdres() + " - " + pacjent[i].getContactPerson() + " - " + pacjent[i].getPhoneNumber());
            System.out.println(badanie[i].getNazwaBadania() + " - " + badanie[i].getDataBadania() + " - " + badanie[i].getNamePrzepro() + " - " + badanie[i].getOplata());

            sumaOplat += badanie[i].getOplata();
        }

        System.out.println("Suma oplat: " + sumaOplat);
    }
}
