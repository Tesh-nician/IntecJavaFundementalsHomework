package Les1.Oefeningen.Oefening2;
import java.time.LocalTime;

public class TimeBomb {


    int timer;
    private Thread timeBomb;


    public TimeBomb(int timer) {
        this.timer = timer;





        timeBomb = new Thread(() -> {

            Thread.currentThread().setPriority(7); //helpt niet
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " s!");
                Thread.yield();
                try {
                    Thread.sleep(this.timer * 150);
                } catch (InterruptedException e) {
                    System.out.println("Disarmed!");

                }
            }

            long timeEnd = LocalTime.now().getSecond();
            System.out.println("BANG!!!!!!");

        });


    }

    public void activate() {
        //long timeStart = LocalTime.now().getSecond();//werkt niet: probleem met scope, oplossing
        // is timeStart als return value en dan gebruiken in de main thread.
        // Maar dit is teveel werk voor deze eenvoudige opdracht :-)
        timeBomb.start();
    }

    public void disarm() {

        if (timeBomb.isAlive()) {
            timeBomb.interrupt();
        }
    }



}