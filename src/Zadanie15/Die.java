package Zadanie15;

import java.util.Random;

public class Die {
    private int sides;
    private Random rng;

    public Die(int sides){
        this.sides = sides;
        this.rng = new Random();
    }

    public int roll(){
        return rng.nextInt(sides)+1;
    }

}