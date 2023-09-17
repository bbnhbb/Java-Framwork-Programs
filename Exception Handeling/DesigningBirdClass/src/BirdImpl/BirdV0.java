public class BirdV0 {
    //    Behaviours
    int weight;
    String color;
    String type;
    int size;
    String beakType;

    //    Methods

    void fly() {
        if (this.type.equals("Sparrow")) {
            System.out.println("BirdV0 flies like a Sparrow");
        } else if (this.type.equals("Crow")) {
            System.out.println("BirdV0 flies like a Crow");
        } else if (this.type.equals("Penguin")) {
            System.out.println("BirdV0 files like a Penguin");
        }
    }

    String eat() {
        return null;
    }

    String makeSound(){
        return null;
    }
}
