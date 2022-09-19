package Zadanie9;

public class MonthDays {
    private int month, year;
    private int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int numberOfDays() {
        if (this.year%100 == 0) {
            if (this.year%400 == 0) {
                daysOfMonth[1] = 29;
            }
        }
        else {
            if (this.year%4 == 0) {
                daysOfMonth[1] = 29;
            }
        }
        return daysOfMonth[this.month-1];
    }
}
