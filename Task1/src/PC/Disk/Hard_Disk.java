package PC.Disk;

public class Hard_Disk {
    private Type type;
    private int memory_size;
    private double weight;

    public Hard_Disk(Type type, int memory_size, double weight) {
        this.type = type;
        this.memory_size = memory_size;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getMemory_size() {
        return memory_size;
    }

    public void setMemory_size(){
        this.memory_size = memory_size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hard_Disk{" +
                "type=" + type +
                ", memory_size=" + memory_size +
                ", weight=" + weight +
                '}';
    }
}
