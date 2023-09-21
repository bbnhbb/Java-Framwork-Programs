public class Bird implements Cloneable<Bird> {

    private String name;
    private String color;
    private int weight;

    public Bird() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bird(Bird old) {
        this.name = old.name;
        this.color = old.color;
        this.weight = old.weight;
    }

    @Override
    public Bird clone() {
        return new Bird(this);
    }
}
