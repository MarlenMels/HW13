package PC.Proc;

public enum CoresNumber {
    LARGE_NUMBER(8),
    BASE_NUMBER(4),
    LOW_NUMBER(2);

    private int number;
    CoresNumber(int number) {
        this.number = number;
    }
}
