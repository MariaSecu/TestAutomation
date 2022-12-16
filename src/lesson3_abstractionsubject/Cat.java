package lesson3_abstractionsubject;

public class Cat extends Animal {
    public Cat(boolean isMoving, boolean isEating, boolean isBreathing) {
        super.isMoving = isMoving;
        super.isEating = isEating;
        super.isBreathing = isBreathing;
    }

    public String makeNoise() {
        return "meow";
    }

    public boolean getIsMoving() {
        if (isMoving) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getIsBreathing() {
        return true;
    }

    public boolean getIsEating() {
        return true;
    }
}
