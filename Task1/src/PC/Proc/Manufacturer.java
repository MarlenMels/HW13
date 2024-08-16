package PC.Proc;

public enum Manufacturer {
    CHINA("Made in China"),
    TAIWAN("Made in Taiwan"),
    AMERICA("Made in America");
    String country;
    Manufacturer(String country){
        this.country = country;
    }


}
