package Les1.Examples;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jai");
        list.add("Vivek");
        list.add("Mahesh");
        list.add("Vishal");
        list.add("Naren");
        list.add("Hemant");
        list.add("Vikas");
        list.add("Ajay");

        list.forEach((name)-> System.out.println(name));
    }
}
