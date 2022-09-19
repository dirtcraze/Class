package Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        int radius = keyboard.nextInt();

        Circle kolo = new Circle(radius);

        System.out.println("Pole powierzchni: " + kolo.area());
        System.out.println("Średnica: " + kolo.diameter());
        System.out.println("Obwód: " + kolo.circumference());
    }
}
