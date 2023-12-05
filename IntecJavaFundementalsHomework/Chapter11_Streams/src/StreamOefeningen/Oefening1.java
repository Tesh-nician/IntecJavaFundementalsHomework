package StreamOefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening1 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList=numList.stream().filter(i -> i%2==0).collect(Collectors.toList());
        int howMany=(int)numList.stream().filter(i -> i%2==0).count();
        int sum=evenList.stream().reduce(0,(a,b) -> a+b);

        System.out.println(evenList);
        System.out.println("count: "+ howMany);
        System.out.println("The average of even numbers is: "+sum/howMany);

    }
}
