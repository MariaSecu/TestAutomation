package backer;

public class WeddingCake extends Cake {
    public int tiers;

    public int getTiers(int tiers) {
        System.out.println("The cake will have " + tiers + " tiers.");
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

}
