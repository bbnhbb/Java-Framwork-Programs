package BirdsV1;
import BirdImpl.BirdV1;
public class Pigeon extends BirdV1 {
    @Override
    public void fly() {
        System.out.println("Pigeon fiy like a bird");
    }
}
