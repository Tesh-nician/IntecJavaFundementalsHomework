package Les2;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {

        ///home/dev_one/Documents/text1.txt

        String sourceFile = "/home/dev_one/Documents/text1.txt";
        String destinationFile = "/home/dev_one/Documents/newTest.txt";

        try (InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
             int bytesRead;

             while ((bytesRead= inputStream.read(buffer)) !=-1)
            {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully");

             inputStream.close();
             outputStream.close();

            } catch (IOException e) {
                e.printStackTrace();

            }

    }
}
