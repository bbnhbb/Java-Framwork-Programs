package BirdsV5;

import BirdImpl.BirdV5;

public class Sparrow extends BirdV5 implements Flying {
    @Override
    public void fly() {
        PigeonSparrowFlyingBehaviour psfb = new PigeonSparrowFlyingBehaviour();
        psfb.makeFly();
    }
}