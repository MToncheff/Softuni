package JavaOOP.WorkingWithAbstraction.CardsWithPower;


public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    public int getPower() {
        return power;
    }

    Suit(int power) {
        this.power = power;
    }
}