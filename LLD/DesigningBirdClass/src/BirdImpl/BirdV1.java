package BirdImpl;

abstract public class BirdV1 {
    //    Behaviours
    int weight;
    String color;
    String type;
    int size;
    String beakType;

    //    Methods

    public abstract void fly();

    String eat() {
        return null;
    }

    String makeSound(){
        return null;
    }
}
