package Les1.Oefening2;

public class LambdaFactorialMain {
    public static void main(String[] args) {

        LambaOperator result = (number) -> {
            int factor = 1;
            for (int n = number-1; n>0; n--) {
                factor+=(factor*n);
            }
            return factor;
        };


        System.out.println(result.factorial(20));
    }

}
