package Project3;

public class WhyPhone extends SmartPhone{
    private static String COLOR;

    public WhyPhone(double price, String brand, String color) {
        super(price, brand);
        COLOR=color;
    }

    @Override
    public String toString() {
        return getBRAND()+" Price: "+getPRICE()+" Color: "+COLOR+"Number of Photos in memory: "+getNumberOfPhotos();
    }

}
