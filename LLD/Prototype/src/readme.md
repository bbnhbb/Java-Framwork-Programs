## Prototype implementation 
- use prototype pattern 
  - when code shouldn't depend on the concrete classes of the objects that you need to copy.
  ```java
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
    ```

- Use Prototype registry pattern when you want to reduce the no of sub classes that only differ in the way they intialize their respective objects.
  - somebody could have created these subclasses to be able to create objects with a specific configuration in the registry 

  ```java
    Sparrow longLeggedSparrow = new Sparrow();
      longLeggedSparrow.setLegsSize("hundred");

      Crow sweetSoundCrow = new Crow();
      sweetSoundCrow.setSound("kookoo");

      BirdRegistry birdRegistry = new BirdRegistry();
      birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
      birdRegistry.registerBird("longLeggedSparrow", longLeggedSparrow);

      List<String> getBirdOfTypes = List.of(
              "sweetSoundCrow",
              "longLeggedSparrow",
              "sweetSoundCrow"
      );

      List<Bird> requestedBirds = new ArrayList<>();

      for (String type: getBirdOfTypes) {
          requestedBirds.add(birdRegistry.getBird(type));
      }
  ```