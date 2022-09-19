package Zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] results = new int[3];
        Scanner keyboard = new Scanner(System.in);
        for (int i=1; i<=3; i++) {
            System.out.println("Podaj wynik testu nr " + i + ": ");
            results[i-1] = keyboard.nextInt();
        }

        System.out.println("Średni wynik to: " + avgResult(results));
    }

    public static int avgResult(int[] results) {
        int avgResult = 0;
        for (int i=0; i<results.length; i++) {
            avgResult += results[i];
        }
        return avgResult/results.length;
    }
}
