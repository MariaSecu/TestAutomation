import lesson3_abstractionsubject.Cat;
import lesson3_abstractionsubject.Dog;
import lesson3_abstractionsubject.Ship;

public class MainMethod {
    public static void main(String[] args) {
        Cat bettyCat = new Cat(true, true, true);
        System.out.println("Betty Cat is move through " + bettyCat.getIsMoving() + " ,is eating " + bettyCat.getIsEating() + " and is breathing " + bettyCat.getIsBreathing() + ".");
        System.out.println("The cat makes this noise: " + bettyCat.makeNoise());
        Dog bobyDog = new Dog(true, false, true);
        System.out.println("Boby dog is move through " + bobyDog.getIsMoving() + " ,he is eating " + bobyDog.getIsEating() + " and is brething " + bobyDog.getIsBreathing() + ".");
        System.out.println("The dog make this noise: " + bobyDog.makeNoise());
        Ship dollyShip = new Ship(true, true, true);
        System.out.println("The Dolly ship is move through: " + dollyShip.getIsMoving() + " ,is eating " + dollyShip.getIsEating() + " and she is breathing " + dollyShip.getIsBreathing() + ".");
        System.out.println("The Dolly ship make this noise: " + dollyShip.makeNoise());
    }
}