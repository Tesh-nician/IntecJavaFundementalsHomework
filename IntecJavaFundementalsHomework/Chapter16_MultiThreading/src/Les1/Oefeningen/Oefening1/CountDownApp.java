package Les1.Oefeningen.Oefening1;
public class CountDownApp {

    public static void main(String[] args) throws InterruptedException {

        CountDownPrint myThread = new CountDownPrint();
        Thread myThread1 = new Thread(myThread);


        myThread1.start();
        for (int i = 10; i > 0; i--) {
            //System.out.println(i + "!");
            CountDownPrint.print(i);

        }
    }

    private static class CountDownPrint implements Runnable {

        public static void print(int c) throws InterruptedException {
            System.out.println(c + " !");
            Thread.sleep(1000);
        }

        @Override
        public void run() { }
    }
}