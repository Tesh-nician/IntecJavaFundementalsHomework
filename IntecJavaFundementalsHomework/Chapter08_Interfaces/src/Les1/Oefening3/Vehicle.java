package Les1.Oefening3;

import Les1.Oefening2.Motor;

public interface Vehicle extends Switch, Motor {


    int doors = 5;
    void openDoor(int door);
    void closeDoor(int door);
}
