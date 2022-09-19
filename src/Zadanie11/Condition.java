package Zadanie11;

public class Condition {
    private int temperature;

    public Condition(int temperature) {
        this.temperature = temperature;
    }

    public boolean isEthylFreezing() {
        return this.temperature<=-114;
    }

    public boolean isEthylBoiling() {
        return this.temperature>=78;
    }

    public boolean isOxygenFreezing() {
        return this.temperature<=-218;
    }

    public boolean isOxygenBoiling() {
        return this.temperature>=183;
    }

    public boolean isWaterFreezing() {
        return this.temperature<=0;
    }

    public boolean isWaterBoiling() {
        return this.temperature>=100;
    }
}
