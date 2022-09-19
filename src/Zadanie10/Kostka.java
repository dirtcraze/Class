package Zadanie10;

import java.util.Random;

public class Kostka {
    private int sides;
    private Random rng;

    public Kostka(int sides){
        this.sides = sides;
        this.rng = new Random();
    }

    public int roll(){
        return rng.nextInt(sides)+1;
    }

}