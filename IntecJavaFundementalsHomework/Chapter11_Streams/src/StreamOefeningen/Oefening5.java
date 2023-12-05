package StreamOefeningen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jai");
        names.add("Vivek");
        names.add("Mahesh");
        names.add("Vikas");
        names.add("Naren");
        names.add("Hemant");
        names.add("Vikas");
        names.add("Ajay");
        names.add("Jai");


        List<String> sortedString = names.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedString); for debugging.

        //Code hieronder werkt niet???
         //List<String> cleanedString = sortedString.stream().filter((s1, s2) -> !s1.equals(s2)).collect(Collectors.toList());
        //Dit werkt dankzij distinct() methode. Gevonden op:  https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        List<String> cleanedString2 = names.stream().distinct().collect(Collectors.toList()); //kan nog korter door stream+distinct methode te gebruiken.
        System.out.println(cleanedString2);

    }
}


