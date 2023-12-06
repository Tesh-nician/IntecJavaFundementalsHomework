package Les1;

import java.io.*;
import java.util.stream.Collectors;

public class BufferedReader1 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Intec\\Documents\\test2.txt"));
            //System.out.println(reader.readLine());
            System.out.println(reader.lines().collect(Collectors.toList()));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
