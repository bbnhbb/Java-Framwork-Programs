package BirdsV5;

import BirdImpl.BirdV5;

public class Crow extends BirdV5 implements Flying {
    @Override
    public void fly() {
        CrowEagleFlingBehaviour cefb = new CrowEagleFlingBehaviour();
        cefb.goFly();
    }
}
