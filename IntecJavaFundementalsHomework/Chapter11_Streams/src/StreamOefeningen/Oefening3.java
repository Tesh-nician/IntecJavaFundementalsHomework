package StreamOefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening3 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        boolean even= numList.stream().allMatch(n -> n%2==0);
        System.out.println("Even? = "+even);
    }
}
