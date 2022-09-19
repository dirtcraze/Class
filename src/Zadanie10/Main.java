package Zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Kostka kostka = new Kostka(6);

        int compPoints = 0, userPoints = 0;

        while (compPoints<=21 && userPoints<=21) {
            System.out.println("Komputer wykonał ruch!");
            compPoints += kostka.roll();
            if (compPoints>21) break;
            System.out.print("Czy chcesz wykonać kolejny rzut?(T/N): ");
            String decisionS = keyboard.nextLine();
            char decision = decisionS.charAt(0);
            if (decision == 'N') break;
            userPoints += kostka.roll();
            if (userPoints>21) break;
            System.out.println("Twoja suma oczek wynosi: " + userPoints);
        }

        results(userPoints, compPoints);
    }

    public static void results(int userPoints, int compPoints) {
        System.out.println("\nGra się zakończyła!");
        System.out.println("Twoja suma oczek wynosi: " + userPoints);
        System.out.println("Suma oczek komputera wynosi: " + compPoints + "\n");

        if (userPoints==compPoints) {
            System.out.println("Remis!");
        } else if (userPoints<compPoints && compPoints<=21) {
            System.out.println("Komputer zwycięża!");
        }
        else {
            System.out.println("Wygrywasz!");
        }
    }
}
