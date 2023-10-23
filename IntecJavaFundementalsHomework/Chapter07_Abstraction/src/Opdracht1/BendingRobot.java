package Opdracht1;

public class BendingRobot extends Robot {

    private double maxBendAngle;
    private double bendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        //super(unitName); //Error: must be on the first line????
        setUnitName(unitName);
        this.maxBendAngle = maxBendAngle;
        System.out.println(toString());
        boot();
    }

    public void bend(double bend) {
        this.bendAngle = this.bendAngle + bend;
        if (this.bendAngle > maxBendAngle) {
            System.out.println(getUnitName()+" has achieved maximum bend-angle.");
            bendAngle = maxBendAngle;
        }
        System.out.println(getUnitName()+"'s bend-angle is now: " + this.bendAngle);
        }//end of method

    @Override
    public String toString() {
        return "Hi, I'm "+getUnitName()+". My maxBendAngle=" + maxBendAngle +
                ", and current bendAngle=" + bendAngle +
                '.';
    }
}

