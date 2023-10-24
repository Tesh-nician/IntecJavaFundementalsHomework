package Les1.Oefening5;

public class VartaAA implements Battery {

    int powerReserve = 2000; //Defines the power reserve of the battery.

    @Override
    public int deliverPower() { return this.powerReserve;}



}
