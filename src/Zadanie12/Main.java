package Zadanie12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj roczną stopę oprocentowania: ");
        int RSO = keyboard.nextInt();
        System.out.print("Podaj początkowy stan konta: ");
        int stanKonta = keyboard.nextInt();
        System.out.print("Podaj liczbe miesięcy: ");
        int liczbaMsc = keyboard.nextInt();

        SavingsAccount calculate = new SavingsAccount(RSO,stanKonta, liczbaMsc);

        for (int i=1;i<=liczbaMsc;i++) {
            System.out.print("Kwota zdeponowana na koncie po miesiacu nr " + i + ": ");
            calculate.setZdeponowaneSrodki(keyboard.nextDouble());
            System.out.print("Kwota wypłacona z konta po miesiacu nr " + i + ": ");
            calculate.setWyplaconeSrodki(keyboard.nextDouble());
            System.out.println(calculate.miesiecznyZyskZOdsetek());
        }

        System.out.println("Stan końcowy: " + calculate.miesiecznyZyskZOdsetek());
        System.out.println("Suma zdeponowanych środków: " + calculate.getZdeponowaneSrodkiSuma());
        System.out.println("Suma wypłaconych środków: " + calculate.getWyplaconeSrodkiSuma());
        System.out.println("Łączna wartość odsetek: " + calculate.getOdsetkiSuma());
    }
}
