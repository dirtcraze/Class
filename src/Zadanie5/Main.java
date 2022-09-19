package Zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wprowadź imię i nazwisko pracownika: ");
        String empName = keyboard.nextLine();
        System.out.print("Wprowadź id pracownika: ");
        int empID = keyboard.nextInt();
        Payroll employee = new Payroll(empName, empID);

        double earnings = brutto(employee.getHourlyRate(), employee.getHoursWorked());
        System.out.println("Pensja brutto pracownika wynosi: " + earnings);
    }

    public static int brutto(int hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
