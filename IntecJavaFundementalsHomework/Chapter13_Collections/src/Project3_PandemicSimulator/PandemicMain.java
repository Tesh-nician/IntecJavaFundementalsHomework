package Project3_PandemicSimulator;

import java.util.*;
import java.util.stream.Collectors;

public class PandemicMain {
    public static <Int> void main(String[] args) {

        System.out.println("\n*********************************************************************$\nOPDRACHT 1:");
        //Opdracht 1( /1 ):
        //De hoofdverpleegster wilt dat je alle patienten in een lijst stopt die ervoor zorgt dat elke
        //Patient er maar 1 keer in voorkomt, liefst op volgorde dat ze binnen kwamen. => LinkedHashSet
        //---Zorg ervoor dat je een Collection gebruikt die alleen unieke elementen weergeeft, en alles in
        //volgorde houdt. Print de lijst af = OK


       LinkedHashSet<Patient> patientsUniqueList = new LinkedHashSet<Patient>(Patient.getAllPatients());

        System.out.println("List of patients (LinkedHashSet):\n"+patientsUniqueList);

        System.out.println("\n*********************************************************************$\nOPDRACHT 2:");
        //Opdracht 2 ( /3 ):
        //Terwijl dat je de lijst aan het opmaken ben, krijgen jullie een noodbericht van de regering: er is een
        //nieuw onbekend virus uitgebroken!
        //Het lijkt erop dat de regering vraagt om voorrang te verlenen aan patiënten die een hoge
        //temperatuur hebben, en dan aan patiënten met een hogere leeftijd.

        System.out.println("List of patients sorted by temperature (comparator+lambdas+reversed) :\n"
                +patientsUniqueList.stream().sorted(Comparator.comparing(Patient::getTemperature).reversed()).collect(Collectors.toList()));


        //Bonus ( /1 ):
        //Je baas merkt op dat dit hospitaal werkt op een Amerikaans systeem: als patiënten een
        //verzekering hebben, zou zij het wel leuk vinden als je deze ook zou willen voor trekken na
        //rekening te hebben gehouden met de directieven van de regering.
        //---Sorteer een List van patiënten aan de hand van TemperatureSorter en AgeSorter die de
        //klasse Comparator<Patient> implementeren. Optioneel make je een InsuranceSorter. Je mag hier ook
        //lambdas/streams voor gebruiken = OK
        //Giet de resultaten achteraf in een Queue. Print de lijst af.

        // /For debugging:
        //        System.out.println("Bonus:  patients sorted by temperature, age(reversed), insured: \n"+patientsUniqueList.stream().
        //                sorted(Comparator.comparing(Patient::getTemperature)
        //                        .thenComparing(Patient::getAge).reversed()
        //                            .thenComparing(Patient::isInsured))
        //                                .collect(Collectors.toList()));

        Queue<Patient> patientsQueue = new LinkedList<>(patientsUniqueList.stream() //ik gebruik stream met lambdas
                        .sorted(Comparator.comparing(Patient::getTemperature)
                            .thenComparing(Patient::getAge).reversed() //leeftijd van oud > jong
                            .thenComparing(Patient::isInsured))
                        .toList()); //LinkedList heeft list nodig als input type, LinkedList behoudt ook de input volgorde

        System.out.println("\nOpdracht2 bonus - Patient Queue:\n"+patientsQueue);


        System.out.println("\n*********************************************************************$\nOPDRACHT 3:");

//Opdracht 3 ( /4 ):
//De regering geeft als laatste opdracht om patiënten van elkaar te isoleren, want ze mogen
//elkaar niet besmetten. Het systeem dat ze willen gebruiken gaat als volgt:
//Category 1: Iedereen dat hoge koorts heeft (>=40) of bejaarden (>=65) met gewone koorts of hoger
//(>=38), op voorwaarde dat ze daarboven het onbekende virus hebben. (((patient.getAge<=65 &&
//patient.getTemperature >=38) || patient.getTemperature()>=40) && patient.isUnknownVirus())
//Category 2: De rest van de bevolking die met gewone koorts of hoger (>=38) loopt, en het
//onbekende virus in hun hebben.
//Category 3: Mensen die het onbekende virus hebben, maar geen koorts.
//Category 4: Mensen die koorts hebben (>=38) maar met een bekend virus rondlopen.
//Overige patiënten worden naar huis gestuurd of naar de apotheker.
//---Gebruik een Map die als categorieën 1 t.e.m. 4 als Key gebruikt. The value is telkens een List die je
//opvult met de patiënten in de Queue.
//Print zowel de resultaten van de Map af, als de inhoud van de Queue, die leeg moet zijn.
//Je kunt het volgende gebruiken voor over je Map te itereren.
//for(Map.Entry<Integer, List<Patient>> category : mapCollection.entrySet()){
//int key = category.getKey();
////use a method to iterate over your patientsList}

        HashMap<Int,Patient> categoryQueue = new HashMap<>(); //key = 1-4, value = Patient

        int category;

        //patientsQueue.for


















    }
}
