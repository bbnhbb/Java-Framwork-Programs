package BirdsV4;

import BirdImpl.BirdV4;

public class Pigeon extends BirdV4 implements IFlyingBird, IEatingBird {
    @Override
    public void fly() {
        System.out.println("Pigeon flies like BirdV4");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon eats like birdv4");

    }
}
