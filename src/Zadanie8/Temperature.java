package Zadanie8;

public class Temperature {
    private double fahrenheit, ftemp = fahrenheit;

    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double celcius() {
        return (5.0/9.0) * (this.ftemp - 32.0);
    }

    public double kelvin() {
        return ((5.0/9.0) * (this.ftemp - 32)) + 273;
    }
}
