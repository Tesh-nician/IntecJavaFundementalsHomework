package Les1.Example2;

public class MultiThreadApp {
    public static void main(String[] args) {
        int n = 10;
        for (int i=0;i<n;i++) {
            Demo object=new Demo();
            object.start();
        }
    }
}
