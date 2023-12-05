package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Opdracht1 {

 //Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft
 // waarbij alle Strings die beginnen met een ‘a’ zijn en de lengte van de String groter is dan 3.
 // De Strings moeten ook in omgekeerde volgorde zijn
 // en de Strings moeten worden samengevoegd tot een String met een komma als scheidingsteken.
 //De String moet ook worden afgekort tot 10 karakters.
 //De String moet ook worden voorzien van een prefix en een suffix.
 // De String moet ook worden voorzien van een uniek nummer.
 //De String moet ook worden voorzien van een random getal.

    public List toUpperCase( List<String> strings) {
        //methode 1

        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public List filterA(List<String> strings) {
        //methode 2

        return strings.stream()
                .filter(s->s.startsWith("A"))
                .collect(Collectors.toList());
    }

    public List filterB(List<String> strings) {
        //methode 3

        return strings.stream()
                .filter(s->s.startsWith("A")
                  && s.length()>3)
                .collect(Collectors.toList());
    }

    public List filterC(List<String> strings) {
        //methode 4

        //StringBuilder myStringBuilder = new StringBuilder();
        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3).
                map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.toList());
    }
    public String filterD(List<String> strings) {
        //methode 5

        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3).
                map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.joining(","));
    }

    public String filterE(List<String> strings) {
        //methode 6

        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3)
                .map(s -> s.toUpperCase())
                .map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.joining(","));
    }

    public String filterF(List<String> strings) {
        //methode 7

        return strings.stream()
                 .filter(s->s.startsWith("A")
                        && s.length()>3)
                .map(s -> s.toUpperCase())
                .map(s-> new StringBuilder(s).reverse())
                .map(s->new StringBuilder(s).substring(0,9))//substring index 0 tot 9
                .collect(Collectors.joining(","));
    }

    public String filterG(List<String> strings) {
        //methode 8

        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3)
                .map(s -> s.toUpperCase())
                .map(s-> new StringBuilder(s).reverse())
                .map(s->new StringBuilder(s).substring(0,9))
                .map(s->new StringBuilder("Pre-"+s+"-Post"))
                .collect(Collectors.joining(","));
    }


    public String filterH(List<String> strings) {
        //methode 9

        int uniekNummer=20231110;

        // map toUppercase moet VOOR Stringbuilder
        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3)
                .map(s -> s.toUpperCase())
                .map(s-> new StringBuilder(s).reverse())
                .map(s->new StringBuilder(s).substring(0,9))
                .map(s->new StringBuilder("Pre-"+s+"-Post"))
                .map(s->s.append("-"+uniekNummer))
                .collect(Collectors.joining(","));
    }


    public String filterI(List<String> strings) {
        //methode 10

        int uniekNummer=20231110;


        return strings.stream()
                .filter(s->s.startsWith("A")
                        && s.length()>3)
                .map(s -> s.toUpperCase())
                .map(s-> new StringBuilder(s).reverse())
                .map(s->new StringBuilder(s).substring(0,9))
                .map(s->new StringBuilder("Pre-"+s+"-Post"))
                .map(s->s.append("-"+uniekNummer))
                .map(s->s.append("-"+Math.round(1000000*Math.random())))
                .collect(Collectors.joining(","));
    }



}
