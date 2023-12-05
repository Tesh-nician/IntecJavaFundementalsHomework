package Les1.Oefening1;

import java.util.Arrays;

public class LambdaEvenMain {
    public static void main(String[] args) {

        int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};

      Arrays.stream(numArray).forEach(n -> System.out.println((n%2)==0?n:""));

    }
}
