package Zadanie16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj numer z przedziału 0-36: ");
        int przedzial = keyboard.nextInt();

        RoulettePocket zakres = new RoulettePocket(przedzial);

        System.out.println(zakres.getPocketColor());
    }
}
