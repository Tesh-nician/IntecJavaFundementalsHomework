package Les1.Oefening1;

public class Chest implements Lock {

    @Override
    public void lock() {
        System.out.println("The chest is locked.");

    }

    @Override
    public void unlock() {
        System.out.println("The chest is unlocked.");

    }
}
