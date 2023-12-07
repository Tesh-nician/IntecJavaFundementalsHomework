package Les1.Example2;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print('c',10000));
        Thread thread2 = new Thread(()->print('*',10000));
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread2.start();
        System.out.println(thread2.getState());
        print('c',10000);
    }

    public static void print(char c,int count) {
        for (int i = 0;i<count;i++) {
            System.out.print(c);
        }
    }

}
