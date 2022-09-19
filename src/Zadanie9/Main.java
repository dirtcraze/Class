package Zadanie9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca: ");
        int month = keyboard.nextInt();
        System.out.print("Podaj rok: ");
        int year = keyboard.nextInt();

        MonthDays liczbadni = new MonthDays(month, year);

        System.out.println(liczbadni.numberOfDays());
    }
}
