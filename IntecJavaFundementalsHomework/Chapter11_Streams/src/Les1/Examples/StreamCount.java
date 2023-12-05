package Les1.Examples;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jai");
        names.add("Vivek");
        names.add("Mahesh");
        names.add("Vishal");
        names.add("Naren");
        names.add("Hemant");
        names.add("Vikas");
        names.add("Ajay");
        names.add("Ann");

        long count = names.stream().filter(sName->sName.length()<5).count();
        System.out.println(count + " strings shorter than 5");

    }
}
