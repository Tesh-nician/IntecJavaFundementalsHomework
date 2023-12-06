package Les1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            Path path = Path.of("/home/dev_one/Documents/text1.txt");

            Files.createDirectories(path.getParent());

            fileWriter = new FileWriter(path.toString());
           fileWriter.write("Hi\n");
           fileWriter.write("Hallo\n");
           fileWriter.write("Bonjour\n");

        } catch (IOException ioException) {
            ioException.printStackTrace();

        } finally {
            if (fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

        }
    }
}
