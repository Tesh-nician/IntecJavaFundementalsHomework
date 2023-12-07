package Les1.Example1;

public class PathApp {
    public static void main(String[] args) {
        MijnThread thread01 = new MijnThread("*");
        MijnThread thread02 = new MijnThread("-");

        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();

        System.out.println(thread01.getState());
        System.out.println(thread02.getState());
    }
}
