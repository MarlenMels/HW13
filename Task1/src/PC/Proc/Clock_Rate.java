package PC.Proc;

public enum Clock_Rate {
    HIGH(3.0),
    MEDIUM(2.0),
    LOW(1.0),;

    private double GHz;
    Clock_Rate(double GHz) {
        this.GHz = GHz;
    }


}
