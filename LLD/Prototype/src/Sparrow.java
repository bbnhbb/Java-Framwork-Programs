public class Sparrow extends  Bird {

    private String legsSize;

    public Sparrow(Sparrow old) {
        super(old);
        this.legsSize = old.legsSize;
    }

    public Sparrow() {

    }

    public void setLegsSize(String legsSize) {
        this.legsSize = legsSize;
    }

    @Override
    public Bird clone() {
        return new Sparrow(this);
    }
}
