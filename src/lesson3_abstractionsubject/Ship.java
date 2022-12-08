package lesson3_abstractionsubject;

public class Ship extends Animal {
    public Ship(boolean isMoving, boolean isEating, boolean isBreathing) {
        super.isMoving = isMoving;
        super.isEating = isEating;
        super.isBreathing = isBreathing;
    }

    public String makeNoise() {
        return "Bleats";
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
