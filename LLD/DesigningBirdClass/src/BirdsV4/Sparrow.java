package BirdsV4;

import BirdImpl.BirdV4;

public class Sparrow extends BirdV4 implements IEatingBird, IFlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies like BirdV4");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats like birdv4");
    }
}
