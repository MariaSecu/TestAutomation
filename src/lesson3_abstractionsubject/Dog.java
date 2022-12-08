package lesson3_abstractionsubject;

public class Dog extends Animal {
    public Dog(boolean isMoving, boolean isEating, boolean isBreathing) {
        super.isMoving = isMoving;
        super.isEating = isEating;
        super.isBreathing = isBreathing;
    }

    public String makeNoise() {
        return "Woof Woof";
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public boolean getIsEating() {
        return isEating;
    }

    public boolean getIsBreathing() {
        return isBreathing;
    }
}
