# BirdV3

- List of FlyableBird can we created 
```java

List <FlyableBird> flyBirds = new List<>();
List <NonFlyableBird> nonFlyBirds = new List<>();
```

- Problems comes if some birds  
| Fly      | DontEat   | <br>
| Fly       |  Eat       |<br>
| Dont Fly  |  Eat      |<br>
| Dont Fly  |  Dont Eat   |<br>

- this creates 4 classes 
  - flyable NonEating Birds 
  - flyable eating Birds 
  - nonFlyable Eating Birds 
  - nonFlyable NonEating Birds 
- Again here not possible to get list of flyable classes