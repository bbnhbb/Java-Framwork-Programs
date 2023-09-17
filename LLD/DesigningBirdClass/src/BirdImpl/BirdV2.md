# BirdV2
- problem with v1 is if some bird cannot fly, but we need to 
provide implementation, like Penguin 
### Solutions here are 
- Either leave fly black
- Throw exception , Penguin can't fly
- Log (bird cant fly)
# Liskov's Substitution Principle 
- say's no special treatment for any child class
- Obj of any child class should be able to be substituted / stored 
in a variable of a parent class without requiring any changes in future code

### Problem with V2
- Get a list of all objects that can fly
- no class to represent list of birds that can fly like
- List of FLyableBirds
- Ex: 
```java
// no class to represent list of birds that can fly like
// List <FLyableBirds>
List <Brid> l = List.of(new Owl(), new Penguin())
```

