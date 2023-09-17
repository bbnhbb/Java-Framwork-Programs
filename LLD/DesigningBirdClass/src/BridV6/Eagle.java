package BridV6;

import BirdImpl.BirdV6;

public class Eagle extends BirdV6 implements Flying {
    IFlyingBehaviour cefb = new CrowEagleFlyingBehaviour();
    @Override
    public void fly() {
        cefb.makeFly();
    }
}
