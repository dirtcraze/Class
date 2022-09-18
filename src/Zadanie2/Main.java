package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Car Samochod = new Car(1999, "Toyota");

        for (int i=0; i<5;i++) {
            Samochod.setSpeed(accelerate(Samochod.getSpeed()));
            System.out.println("Obecna prędkość pojazdu: " + Samochod.getSpeed());
        }

        for (int i=0; i<5;i++) {
            Samochod.setSpeed(brake(Samochod.getSpeed()));
            System.out.println("Obecna prędkość pojazdu: " + Samochod.getSpeed());
        }
    }

    public static int accelerate(int speed) {
        int curSpeed = speed;
        return curSpeed + 5;
    }

    public static int brake(int speed) {
        int curSpeed = speed;
        return curSpeed - 5;
    }
}
