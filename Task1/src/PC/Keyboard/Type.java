package PC.Keyboard;

public enum Type {
    MEMBRANE("MEMBRANE keyboard"),
    MECHANICAL("MECHANICAL keyboard"),
    WIRELESS("WIRELESS keyboard"),
    FLEXIBLE("FLEXIBLE keyboard");
    private String type;
    Type(String type) {
        this.type = type;
    }
}
