package PC.RAM;

public class RAM {
    private Type type;
    private int size;
    private double weight;

    public RAM(Type type, int size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type=" + type +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
