package Zadanie16;

public class RoulettePocket {
    private int przedzial;

    public RoulettePocket(int przedzial) {
        this.przedzial = przedzial;
    }

    public String getPocketColor() {
        if (przedzial==0) return "zielony";
        else if (przedzial<=10) {
            if (przedzial%2==0) return "czarne";
            return "czerwone";
        }
        else if (przedzial<=18) {
            if (przedzial%2==0) return "czerwone";
            return "czarne";
        }
        else if (przedzial<=28) {
            if (przedzial%2==0) return "czarne";
            return "czerwone";
        } else if (przedzial<=36) {
            if (przedzial%2==0) return "czerwone";
            return "czarne";
        }
        else return "Error";
    }
}
