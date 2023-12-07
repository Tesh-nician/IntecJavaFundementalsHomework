package Les1.Example1;

public class ExampleSleep {
    public static void main(String[] args) {

        try {

            Thread tread01 = new Thread(new MijnThread("@",100));
            Thread tread02 = new Thread(new MijnThread("-",10));
            System.out.println(tread01.getState());
            System.out.println(tread02.getState());
            tread01.start();
            tread02.start();

            Thread.sleep(2000000);
            System.out.println(tread01.getState());
            tread01.interrupt();
            System.out.println(tread01.getState());
            Thread.sleep(10000);
            tread01.interrupt();
            Thread.sleep(4000);
            tread01.interrupt();







        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
