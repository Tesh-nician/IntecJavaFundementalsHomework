package Les1.Oefening5;

public class DuracelAA implements Battery{


    int powerReserve = 2500; //Defines the power reserve of the battery.

    @Override
    public int deliverPower() { return this.powerReserve;}

}
