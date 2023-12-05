package Streams;

import java.util.Arrays;
import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Acaryanandana","Alp","Asu","Maxime", "Raphael", "Haytam", "Jonathan", "Nina", "Mausam", "Deepika", "Rutger", "Elmaz", "Abdulrazak", "Abdussamad", "Javdan");

        Opdracht1 opdracht = new Opdracht1();

        System.out.println("1.Hoofdletters:\n"+opdracht.toUpperCase(names));
        System.out.println("2.Met een A:\n"+opdracht.filterA(names));
        System.out.println("3.Beginen met een A en groter dan 3:\n"+opdracht.filterB(names));
        System.out.println("4.Beginnen met een A, groter dan 3 en omgekeerd:\n"+opdracht.filterC(names));
        System.out.println("5.Beginnen met een A, groter dan 3, omgekeerd en samengevoegd:\n"+opdracht.filterD(names));
        System.out.println("6. Beginnen met een A, groter dan 3, omgekeerd, samengevoegd en hoofdletters:\n"+opdracht.filterE(names));
        System.out.println("7. Beginnen met een A, groter dan 3, omgekeerd, samengevoegd,hoofdletters en 10 karakters:\n"+opdracht.filterF(names));
        System.out.println("8. Beginnen met een A, groter dan 3, omgekeerd, samengevoegd,hoofdletters, 10 karakters, pre- en suffix:\n"+opdracht.filterG(names));
        System.out.println("9. Beginnen met een A, groter dan 3, omgekeerd, samengevoegd,hoofdletters, 10 karakters, pre- en suffix, en een uniek nummer(datum):\n"+opdracht.filterH(names));
        System.out.println("10. Beginnen met een A, groter dan 3, omgekeerd, samengevoegd,hoofdletters, 10 karakters, pre- en suffix, een uniek nummer en een random getal:\n"+opdracht.filterI(names));








    }

}
