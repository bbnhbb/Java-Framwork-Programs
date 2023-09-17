package BridV6;

import BirdImpl.BirdV6;

public class PigeonDInjection extends BirdV6 implements Flying  {
    IFlyingBehaviour psfb;

    public PigeonDInjection(IFlyingBehaviour psfb) {
        this.psfb = psfb;
    }

    @Override
    public void fly() {
        psfb.makeFly();
    }
}
