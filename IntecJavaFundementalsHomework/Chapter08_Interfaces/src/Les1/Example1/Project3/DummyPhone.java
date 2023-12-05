package Project3;

public class DummyPhone implements ISimCard,IRadio{

    private static String COLOR;
    private static double PRICE = 50;
    private static String BRAND = "";

    public DummyPhone(String color, double price, String brand) {
        this.COLOR=color;
        this.PRICE=price;
        this.BRAND=brand;

    }

    @Override
    public void playChannel(double fm) {

    }

    @Override
    public void changeChannel(double fm) {

    }

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }
}
