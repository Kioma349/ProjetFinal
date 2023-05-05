package m1.finalee.tache2;


public class Banana extends Fruit {
    private String origin;

    public Banana(String origin) {
        super();
        this.origin = origin;
        setValue(100); // Valeur fixée et unique
    }

    private void setValue(int i) {
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public double computePrice() {
        return 0;
    }
}
