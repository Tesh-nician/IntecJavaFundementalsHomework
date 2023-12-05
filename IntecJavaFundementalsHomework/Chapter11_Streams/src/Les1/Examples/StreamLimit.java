package Les1.Examples;

import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream.of("Jai","Mahesh","Anneke","Vishal","Naren","Hemant")
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
