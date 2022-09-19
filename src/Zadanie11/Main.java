package Zadanie11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj temperaturę: ");
        int temperature = keyboard.nextInt();

        Condition condition = new Condition(temperature);

        System.out.print("Substancje które zamarzają: ");
        System.out.print(condition.isEthylFreezing() ? "Etanol, " : " ");
        System.out.print(condition.isOxygenFreezing() ? "Tlen, " : " ");
        System.out.print(condition.isWaterFreezing() ? "Woda" : " \n");

        System.out.print("Substancje które wrą: ");
        System.out.print(condition.isEthylBoiling() ? "Etanol, " : " ");
        System.out.print(condition.isOxygenBoiling() ? "Tlen, " : " ");
        System.out.print(condition.isWaterBoiling() ? "Woda" : " \n");
    }
}
