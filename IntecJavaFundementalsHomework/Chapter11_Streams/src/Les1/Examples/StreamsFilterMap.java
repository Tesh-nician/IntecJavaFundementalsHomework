package Les1.Examples;

import java.util.ArrayList;
import java.util.List;

public class StreamsFilterMap {
    public static void main(String[] args) {
        List<String > myPlaces = new ArrayList<>();
        myPlaces.add("Nepal, Kathmandu");
        myPlaces.add("Nepal, Pokhara");
        myPlaces.add("India, Delhi");
        myPlaces.add("USA, New York");
        myPlaces.add("Africa, Nigeria");
        myPlaces.add("Belgie, Brussel");

        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                        .map((p) -> p.toUpperCase())
                .forEach((p)-> System.out.println(p));

        myPlaces.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
