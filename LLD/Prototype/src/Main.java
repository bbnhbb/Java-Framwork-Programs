import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird b1 = new Bird();
        b1.setName("Bhrath");
        b1.setColor("red");
        b1.setWeight(60);

        Sparrow s1 = new Sparrow();
        s1.setColor("Blue");
        s1.setLegsSize("hey");

        Crow c1 = new Crow();
        c1.setSound("Kooo");
        c1.setWeight(34);


        List<Bird> birds = List.of(
                s1,
                c1,
                b1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parent: birds) {
            children.add(parent.clone());
        }

        System.out.println("Done");


//        Prototype registry
        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setLegsSize("Hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("KooKoo");

        BirdRegistry br = new BirdRegistry();
        br.registerBird("SweetSoundCrow", sweetSoundCrow);
        br.registerBird("LongLeggedSparrow", longLeggedSparrow);

        List<String> getBirdsOfTypes = List.of(
                "SweetSoundCrow",
                "LongLeggedSparrow",
                "SweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for(String type: getBirdsOfTypes) {
            requestedBirds.add(br.getBird(type));
        }


        System.out.println("Hello world!");
    }
}