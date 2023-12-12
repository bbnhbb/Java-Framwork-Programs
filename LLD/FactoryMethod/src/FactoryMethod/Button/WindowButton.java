package FactoryMethod.Button;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Window button on click");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! window button says = 'Hello world'");
    }
}
