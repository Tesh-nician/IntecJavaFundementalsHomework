package StreamOefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening4 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(integers.stream().reduce(1,(a,b) -> a*b));
    }
}
