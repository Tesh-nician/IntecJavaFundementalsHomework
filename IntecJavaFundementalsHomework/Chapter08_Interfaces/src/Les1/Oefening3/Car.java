package Les1.Oefening3;

public class Car implements Vehicle {


    private boolean startSwitch = false ;//false = off, true = on

    private int carDoors = doors; //aantal OPEN deuren. Methode gas() enkel mogelijk indien carDoors = 0.

    @Override // methode gebruikt DUBBELE ternary operator voor de check of startSwitch == true en carDoors = 0. :-)
    public void gas() {
        System.out.println(startSwitch&&(carDoors==0)? "Now accelerating":!startSwitch?"The motor has not been switched on":this.carDoors+ " doors are still open!");
    }

    @Override //methode om startSwitch true/false te flippen.
    public void toggleSwitch() {
        if (this.startSwitch == false) {
            this.startSwitch=true;
            System.out.println("Switching ON");
        }
        else {
            this.startSwitch=false;
            System.out.println("Switching OFF");
        }
    }

    @Override // methode om deuren te openen. Check voor maximum aantal OPEN deuren(=doors) .
    public void openDoor(int door) {
        if ((this.carDoors+door) > doors) {
            this.carDoors=doors;
        }
        else {
            this.carDoors = this.carDoors+door;
        }
    }



    @Override
    public void closeDoor(int door) {
        if (this.carDoors-door<=0) {
            this.carDoors=0;
        }
        else {
            this.carDoors =this.carDoors-door;
        }

    }


    @Override
    public String toString() {
        return "Car{" +
                "startSwitch=" + startSwitch +
                ", carDoors=" + carDoors +
                '}';
    }
}
