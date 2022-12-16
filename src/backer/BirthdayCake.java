package backer;

public class BirthdayCake extends Cake {
    public int candles;

    public int getCandles(int candles) {
        System.out.println("The number of candles is: " + candles);
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
