package PC.Screen;

public enum Type {
    IPS("IPS"),
    OLED("OLED"),
    AMOLED("AMOLED"),
    TN("TN"),
    VA("VA");
    private String type;
    Type(String type){
        this.type = type;
    }
}
