package BirdsV4;

import BirdImpl.BirdV4;

public class Penguin extends BirdV4 implements IEatingBird {
    @Override
    public void eat() {
        System.out.println("Penguin eats like birdv4");
    }
}
