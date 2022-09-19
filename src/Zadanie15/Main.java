package Zadanie15;

public class Main {
    public static void main(String[] args) {
        int gracz = 0, komputer = 0, graczPkt = 0, kompPkt = 0;

        Die kostka = new Die(6);

        for (int i=1;i<=10;i++) {
            gracz = kostka.roll();
            komputer = kostka.roll();

            System.out.println(gracz + " : " + komputer);
            if (gracz>=komputer) graczPkt++;
            else if (gracz<=komputer) kompPkt++;

        }
        System.out.println("Ostateczny wynik! " + graczPkt + " - " + kompPkt);
        if (graczPkt>kompPkt) System.out.println("Wygrywasz!");
        else if (graczPkt==kompPkt) System.out.println("Remis!");
        else System.out.println("Wygrywa komputer!");

    }
}
