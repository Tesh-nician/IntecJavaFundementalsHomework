package Les1.Oefening2;

public class Car implements Motor,Switch{


    private boolean startSwitch = false ;//false = off, true = on

    @Override // methode gebruikt ternary operator voor de check of startSwitch == true.
    public void gas() {
        System.out.println(startSwitch? "Now accelerating":"The motor has not been switched on");
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


}
