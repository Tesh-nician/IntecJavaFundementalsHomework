package Les1.Oefeningen.Oefening2;
import java.util.Random;

public class VillainSpot  {
    public static void main(String[] args) {
        Random random = new Random();
        //Thread.currentThread().setPriority(10);//helpt niet



        TimeBomb timeBomb = new TimeBomb(10); // Bomb has 10 seconds!


        timeBomb.activate(); //dit start de counter, de variable int counter wordt in de constructor geattribueerd.


        try {

            //System.out.println(LocalTime.now());
            Thread.sleep(random.nextInt(10000)); // It will take us between 0-30 secs to disarm the bomb.
            timeBomb.disarm();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

