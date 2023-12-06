package OefeningFileIO;

import java.io.*;
import java.util.stream.Collectors;

public class OefeningFIO {
    public static void main(String[] args) {



        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/dev_one/Documents/FromJonathanToHilal/message.txt"));
            writer.write("What’s the first step in understanding recursion?\n" +
                    "To understand recursion, you must first understand recursion.\n"+":-)");

            writer.flush(); //is dit good practice??
            writer.close();

            System.out.println("\n\nPrinting joke:");
            BufferedReader reader = new BufferedReader(new FileReader("/home/dev_one/Documents/FromJonathanToHilal/message.txt"));
            System.out.println(reader.lines().collect(Collectors.toList()));
            reader.close();



            Cat myCat = new Cat(); //Cat class is in dezelfde file, onderaan.


            BufferedWriter newWriter = new BufferedWriter(new FileWriter("/home/dev_one/Documents/FromJonathanToHilal/animal.txt"));

            newWriter.write((myCat.toString()));

            newWriter.flush(); //good practice??
            newWriter.close();

            System.out.println("\n\nPrinting animal class:");
            BufferedReader newReader = new BufferedReader(new FileReader("/home/dev_one/Documents/FromJonathanToHilal/animal.txt"));
            System.out.println(newReader.lines().collect(Collectors.toList()));
            reader.close();








        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

    class Cat {
    String name="Anais";
    boolean edible=false;

        @Override
        public String toString() {
            return " I am a Cat, my name is " + name + "\n"+"Edibility: "+edible;
        }
    }

