package StreamOefeningen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oefening2 {
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
        names.add("Jo");

        List<Integer> lenghts = names.stream().map(s->s.length()).collect(Collectors.toList());
        //System.out.println(lenghts);
        int maxlength = Collections.max(lenghts);
        //System.out.println(maxlength);
        System.out.println(names.stream().filter(s -> s.length()==maxlength).collect(Collectors.toList()));

    }
}
