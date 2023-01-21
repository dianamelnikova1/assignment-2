package enitity;

public class Car extends Transport{
    private String brandName;

    public Car(int maxPassengers) {
        super(maxPassengers);
    }

    public Car(int maxPassengers, String brandName) {
        super(maxPassengers);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
