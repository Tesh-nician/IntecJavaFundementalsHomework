package Les2.Examples.SteamCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1,1);

        System.out.println(integers.stream().reduce(23,(a,b) -> a+b));

        IntStream numbers6 = IntStream.range(1,100);

        System.out.println(numbers6.reduce(0, (acc,el) -> acc+el));

        String[] colors = {"blue","white", "red", "yellow", "purple"};
        System.out.println(Stream.of(colors).reduce("", (acc,el) -> acc+el+";"));
    }
}
