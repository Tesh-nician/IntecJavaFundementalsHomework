package Opdracht1;

public class LiftingRobot extends Robot {
    private double maxLiftHeight;
    private double liftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        //super(unitName); //Error: must be on the first line????
        setUnitName(unitName);
        this.maxLiftHeight = maxLiftHeight;
        System.out.println(toString());
        boot();
    }

    public void lift(double lift) {
        this.liftHeight = this.liftHeight + lift;
        if (this.liftHeight > maxLiftHeight) {
            System.out.println(getUnitName() + " has achieved maximum elevation.");
            liftHeight = maxLiftHeight;
        }
        System.out.println(getUnitName() + "'s elevation is now: " + this.liftHeight);
    }//end of method

    @Override
    public String toString() {
        return "Hi, I'm " + getUnitName() + ". My maximum elevation=" + maxLiftHeight +
                ", and current elevation=" + liftHeight +
                '.';
    }

}
