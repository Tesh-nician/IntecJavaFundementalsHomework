package Les1.Examples;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add(0,"Jai");
        names.add(1,"Mahesh");
        names.add(2,"Vishal");

        names.forEach((name)-> System.out.println(name+" - "));
    }
}
