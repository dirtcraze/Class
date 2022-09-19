package Zadanie1;

import Zadanie4.RetailItem;

public class Main {
    public static void main(String[] args) {
        Employee pracownik[] = new Employee[3];

        pracownik[0] = new Employee("Sara Magura", 47899, "Rachunkowość", "Wiceprezes");
        pracownik[1] = new Employee("Marek Janczyk", 39119, "Informatyka", "Programista");
        pracownik[2] = new Employee("Julia Rak", 81774, "Produkcja", "Inżynier");

        for (int i=0; i<pracownik.length; i++) {
            System.out.println(pracownik[i].getName() + " - " + pracownik[i].getID() + " - " +  pracownik[i].getDepartment() + " - " +  pracownik[i].getPosition());
        }
    }
}
