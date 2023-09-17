import BirdImpl.BirdV0;
import BirdImpl.BirdV1;
import BirdImpl.BirdV6;
import BirdsV1.Crow;
import BirdsV1.Hen;
import BirdsV1.Pigeon;
import BirdsV1.Sparrow;
import BridV6.Eagle;
import BridV6.PigeonSparrowFlyingBehaviour;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//         V0 IMPL
        BirdV0 b = new BirdV0();
        b.type = "Sparrow";
        b.fly();

        BirdV0 b1 = new BirdV0();
        b1.type = "Crow";
        b1.fly();

        BirdV0 b2 = new BirdV0();
        b2.type = "Penguin";
        b2.fly();

        //        V1 IMPL
        BirdV1 s = new Sparrow();
        s.fly();

        BirdV1 h = new Hen();
        h.fly();

        BirdV1 c = new Crow();
        c.fly();

        BirdV1 p = new Pigeon();
        p.fly();

        //  V6 IMPL
        Eagle e6 = new Eagle();
        e6.fly();

        BridV6.Pigeon p6 = new BridV6.Pigeon();
        p6.fly();

        //        V6 Dependency Injection
        BridV6.PigeonDInjection p6di = new BridV6.PigeonDInjection(new PigeonSparrowFlyingBehaviour());
        p6di.fly();
    }
}