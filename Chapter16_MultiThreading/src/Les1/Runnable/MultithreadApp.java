package Les1.Runnable;

public class MultithreadApp {
    public static void main(String[] args) {
        int n=8;
        for (int i=0;i<n;i++) {
            Thread object = new Thread(new MultiThreadingDemo());
            object.start();
        }
    }
}
