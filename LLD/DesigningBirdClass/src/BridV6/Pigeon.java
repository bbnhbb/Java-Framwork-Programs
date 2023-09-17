package BridV6;

import BirdImpl.BirdV6;

public class Pigeon extends BirdV6 implements Flying {
    IFlyingBehaviour psfb = new PigeonSparrowFlyingBehaviour();
    @Override
    public void fly() {
        psfb.makeFly();
    }
}
