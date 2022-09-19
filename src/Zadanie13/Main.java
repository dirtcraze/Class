package Zadanie13;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj roczną stopę oprocentowania: ");
        int RSO = keyboard.nextInt();
        System.out.print("Podaj początkowy stan konta: ");
        int stanKonta = keyboard.nextInt();

        SavingsAccount calculate = new SavingsAccount(RSO,stanKonta);

        File Deposits = new File("src/Zadanie13/Deposits.txt");
        File Withdrawals = new File("src/Zadanie13/Withdrawals.txt");
        Scanner DepositsScan = new Scanner(Deposits);
        Scanner WithdrawalScan = new Scanner(Withdrawals);

        while (DepositsScan.hasNext()){
            double Depo = Double.parseDouble(DepositsScan.nextLine());
            calculate.setZdeponowaneSrodki(Depo);
            double Withdraw = Double.parseDouble(WithdrawalScan.nextLine());
            calculate.setWyplaconeSrodki(Withdraw);
            calculate.miesiecznyZyskZOdsetek();
        }

        System.out.println("Stan końcowy: " + calculate.miesiecznyZyskZOdsetek());
        System.out.println("Suma zdeponowanych środków: " + calculate.getZdeponowaneSrodkiSuma());
        System.out.println("Suma wypłaconych środków: " + calculate.getWyplaconeSrodkiSuma());
        System.out.println("Łączna wartość odsetek: " + calculate.getOdsetkiSuma());
    }
}
