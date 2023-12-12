package FactoryMethod.Button;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Html button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! button says = 'Hello world'");
    }
}
