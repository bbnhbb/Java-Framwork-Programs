# BirdV5
- This example is to demonstrate how we will end up with Dependency Inversion 
- here code duplication issue is resolved 
- common bird with similar behaviours are grouped together 
  - PigeowSparrowFlyingBehaviour
  - CrowEagleFlyingBehaviour
- In the Fly method of Bird we are calling objects created by these classes  
```java
// crow class
@Override
public void fly() {
    CrowEagleFlingBehaviour cefb = new CrowEagleFlingBehaviour();
    cefb.goFly();
}
```


- If tomorrow Crow want to change its behaviour to PSFB
- Crow method changes are too many 

```java
@Override
public void fly() {
PiggionSparrowFlingBehaviour psfb = new PiggionSparrowFlingBehaviour();
psfb.makeFly();
}
```

- So this violates <u>Dependency Inversion Principle</u>
- As Pigeon class is directly dependent on PSFB class
|Pigeon| -> |PSFB|

## Dependency Inversion Principle
No 2 concreted classes should directly depend on each other, they should depeend on each other via an interface in b/w.

- Solution 
  - Both PSFB and CSFB should implement IFlyingBehaviour which has fly()
  - Now |Pigeon| -> |Flying Behaviour| <-|PSFB|
  - Pigeon and PSFB class are interdependent on each other via Flying Behaviour interface 
