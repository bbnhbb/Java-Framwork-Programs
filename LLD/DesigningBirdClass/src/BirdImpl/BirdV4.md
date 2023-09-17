# Bird V4

## Interface
- is like blueprint of behaviour
- many intermediatory class creation can be reduced 
- Also can get list of Flying and Eating class available
```java
List<IEatingBird> eb = new List<>()
List<IFlyingBird> fb = new List<>()
        
//  Will help in this kind of code
for (IEatingBirds e: Birds) {
    e.eat();
}
```

# Interface separation principle
- interfaces should be as light as posible
- dont have generalized interfaces 
- make interface as specific as possible
- have very less no of methods in interface
  - ideally 1 method interface as common and called <u>Functional interface</u>
  - which is used in <u> Labmda expressions </u>

# Problems 
- Code duplication happens 
  - as all the bird classes are 
  implemeting the IFlyableBird and IEatableBird and giving 
  implementation but if it flying and eating in same way, code 
  duplication problem occurs.


