package Les1.Oefening2;

public class CarApp {
    public static void main(String[] args) {

        Car newCar = new Car();
        //startSwitch default = false (off)
        newCar.gas();
        newCar.toggleSwitch();
        newCar.gas();
    }
}
