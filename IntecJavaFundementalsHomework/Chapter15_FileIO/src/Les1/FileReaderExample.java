package Les1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("/home/dev_one/Documents/text1.txt");

            int position;

            while ((position = fileReader.read()) != -1) {
                System.out.print((char) position);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("Deze bestand bestaat niet");

        } finally {
            if (fileReader !=null) {
                try {
                    fileReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
