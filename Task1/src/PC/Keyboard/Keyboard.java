package PC.Keyboard;

public class Keyboard {
    private Type type;
    private BackLight check;
    private double weight;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public BackLight getCheck() {
        return check;
    }

    public void setCheck(BackLight check) {
        this.check = check;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Keyboard(Type type, BackLight check, double weight) {
        this.type = type;
        this.check = check;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", check=" + check +
                ", weight=" + weight +
                '}';
    }
}
