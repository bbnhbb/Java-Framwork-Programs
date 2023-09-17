package BirdImpl;
public class BirdV0 {
    //    Behaviours
    public int weight;
    public String color;
    public String type;
    public int size;
    public String beakType;

    //    Methods

    public void fly() {
        if (this.type.equals("Sparrow")) {
            System.out.println("BirdV0 flies like a Sparrow");
        } else if (this.type.equals("Crow")) {
            System.out.println("BirdV0 flies like a Crow");
        } else if (this.type.equals("Penguin")) {
            System.out.println("BirdV0 files like a Penguin");
        }
    }

    public String eat() {
        return null;
    }

    public String makeSound(){
        return null;
    }
}
