package Zadanie8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Fahrenheita: ");
        double temp = keyboard.nextDouble();

        Temperature converter = new Temperature(temp);

        System.out.println(converter.getFahrenheit() + " | " + converter.celcius() + " | " + converter.kelvin());
    }
}
