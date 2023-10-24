package Les1.Example1;

public interface Vehicle {
    // constant variables -> bad practice
    public static final int doors = 3; // public static final is unnecessary!
    // int wheels = 4;

    // methods
    void speedUp(); // public abstract is unnecessary!
    void braking();
    void shiftGearUp();
    void shiftGearDown();
    int getCurrentGear();

}
