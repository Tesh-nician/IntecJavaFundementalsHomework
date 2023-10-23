package Opdracht1;

public class RobotApp {
    public static void main(String[] args) {
        BendingRobot bender1 = new BendingRobot("Charlie", 180);
        bender1.bend(50);
        bender1.bend(150);


        LiftingRobot lifter1 = new LiftingRobot("Hercules",300);
        lifter1.lift(100);
        lifter1.lift(250);

        CrazyRobot crazy1 = new CrazyRobot("Marvin");






    }


}
