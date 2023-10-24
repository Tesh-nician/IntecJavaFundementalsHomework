package Les1.Example1;

public class MainApp {
    public static void main(String[] args) {


        Vehicle car01 = new Car(0, 5, 0, 120);
        car01.shiftGearUp();
        System.out.println("Car current gear: " + car01.getCurrentGear());

    }
}

