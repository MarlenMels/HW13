package PC.Proc;

public class Processor {
    private Clock_Rate GHz;
    private CoresNumber number;
    private Manufacturer country;
    private double weight;

    public Processor(Clock_Rate GHz, CoresNumber number, Manufacturer country, double weight) {
        this.GHz = GHz;
        this.number = number;
        this.country = country;
        this.weight = weight;
    }

    public Clock_Rate getGHz() {
        return GHz;
    }

    public void setGHz(Clock_Rate GHz) {
        this.GHz = GHz;
    }

    public CoresNumber getNumber() {
        return number;
    }

    public void setNumber(CoresNumber number) {
        this.number = number;
    }

    public Manufacturer getCountry() {
        return country;
    }

    public void setCountry(Manufacturer country) {
        this.country = country;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "GHz=" + GHz +
                ", number=" + number +
                ", country=" + country +
                ", weight=" + weight +
                '}';
    }
}
