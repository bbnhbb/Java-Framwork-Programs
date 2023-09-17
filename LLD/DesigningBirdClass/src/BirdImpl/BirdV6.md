# Bird V6
- Follows Dependency Inversion 
- Now |Pigeon| -> |Flying Behaviour| <-|PSFB|
    - Pigeon and PSFB class are interdependent on each other via Flying Behaviour interface 
- If tomorrow PSFB say it want to change to CEFB change is very simple as interface method are same only need to change the declaration
```java
// From
IFlyingBehaviour psfb = new PiggionSparrowFlingBehaviour();
// To
IFlyingBehaviour psfb = new CrowEagleFlingBehaviour();

// No need to do chang is fly method and other places 
@Override
public void fly() {
  cefb.goFly();
}
```

## Dependency Injection: 
- In PigeonDInjection file instead of creating object on own in the class 
- Client should pass the object to the constructor of the class 

```java
public class PigeonDInjection extends BirdV6 implements Flying  {
    IFlyingBehaviour psfb;

    public PigeonDInjection(IFlyingBehaviour psfb) {
        this.psfb = psfb;
    }

    @Override
    public void fly() {
        psfb.makeFly();
    }
}

```