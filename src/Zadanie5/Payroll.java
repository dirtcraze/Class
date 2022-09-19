package Zadanie5;

public class Payroll {
    private String name;
    private int userID, hourlyRate, hoursWorked;

    public Payroll(String name, int userID) {
        this.name = name;
        this.userID = userID;
        this.hourlyRate = 42;
        this.hoursWorked = 160;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
