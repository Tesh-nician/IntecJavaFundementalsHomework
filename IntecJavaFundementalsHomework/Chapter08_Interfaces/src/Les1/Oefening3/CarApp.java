package Les1.Oefening3;

public class CarApp {
    public static void main(String[] args) {

        Car newCar = new Car();
        //startSwitch default = false (off) and carDoors=5 (open).
        newCar.gas();
        newCar.toggleSwitch();
        newCar.gas();
        newCar.closeDoor(4);        //there is still 1 open :-)
        newCar.gas();
        newCar.closeDoor(1);        //closes the last door
        newCar.gas();               // this should now work
        System.out.println(newCar.toString()); //checking the final state.

    }
}
