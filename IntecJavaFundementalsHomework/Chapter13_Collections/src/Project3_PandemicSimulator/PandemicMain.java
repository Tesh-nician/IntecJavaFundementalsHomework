package Project3_PandemicSimulator;

import java.util.*;
import java.util.stream.Collectors;

public class PandemicMain {
    public static <Int> void main(String[] args) {


        try {

            System.out.println("\n*********************************************************************\nOPDRACHT 1:");
            //Opdracht 1( /1 ):
            //De hoofdverpleegster wilt dat je alle patienten in een lijst stopt die ervoor zorgt dat elke
            //Patient er maar 1 keer in voorkomt, liefst op volgorde dat ze binnen kwamen. => LinkedHashSet
            //---Zorg ervoor dat je een Collection gebruikt die alleen unieke elementen weergeeft, en alles in
            //volgorde houdt. Print de lijst af = OK


            LinkedHashSet<Patient> patientsUniqueList = new LinkedHashSet<Patient>(Patient.getAllPatients());

            System.out.println("List of patients (LinkedHashSet):\n" + patientsUniqueList + "/number of patients: " + patientsUniqueList.size());


            System.out.println("\n*********************************************************************\nOPDRACHT 2:");
            //Opdracht 2 ( /3 ):
            //Terwijl dat je de lijst aan het opmaken ben, krijgen jullie een noodbericht van de regering: er is een
            //nieuw onbekend virus uitgebroken!
            //Het lijkt erop dat de regering vraagt om voorrang te verlenen aan patiënten die een hoge
            //temperatuur hebben, en dan aan patiënten met een hogere leeftijd.

            System.out.println("List of patients sorted by temperature (comparator+lambdas+reversed) :\n"
                    + patientsUniqueList.stream().sorted(Comparator.comparing(Patient::getTemperature).reversed()).collect(Collectors.toList()));


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

            System.out.println("\nOpdracht2 bonus - Patient Queue:\n" + patientsQueue + "/number of patients in this list: " + patientsQueue.size());


            System.out.println("\n*********************************************************************\nOPDRACHT 3:");

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
            System.out.println("patientsUniqueList before categorisation:\n" + patientsUniqueList);
            System.out.println("patientsUniqueList size: " + patientsUniqueList.size());


            HashMap<List, Integer> categoryQueue = new HashMap<>(100); //key = 1-4, value = Patient

            // making a temporary copy for iteration, to avoid ConcurrentModificationException
            LinkedHashSet<Patient> duplicatepatientsUniqueList = new LinkedHashSet<>(patientsQueue);




            List<Patient> category1 = new LinkedList<>();
            List<Patient> category2 = new LinkedList<>();
            List<Patient> category3 = new LinkedList<>();
            List<Patient> category4 = new LinkedList<>();


            //iterate through queue and add patients to the hashmap with their respective category.
            Iterator<Patient> patientsQueueIterator = duplicatepatientsUniqueList.iterator();//https://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/

            final int[] count = {1}; //om de iteraties te tellen.

            //De testcode hierbeneden werkt!! Count gaat mooi van 1 tot 32, zonder te jumpen. Aarrghhh.

       /* while (patientsQueueIterator.hasNext()) {
            System.out.println(count);
            System.out.println(patientsQueueIterator.next());
            count++;
        }

        count=1;
        */


            System.out.println("Cat 1:");
            System.out.println(patientsQueue.stream().filter(patient -> {
                        if ((patient.getTemperature() >= 40 && patient.isUnknownVirus())
                                || (patient.getAge() >= 65 && patient.getTemperature() >= 38 && patient.isUnknownVirus())) {
                            category1.add(patient);
                            //count[0]++;
                        }
                        return duplicatepatientsUniqueList.remove(patient);
            }).collect(Collectors.toList()));


            System.out.println("Cat 2:");
            System.out.println(patientsQueue.stream().filter(patient2 -> {
                if ((patient2.isUnknownVirus()) && (patient2.getTemperature() >= 38)) {
                        category2.add(patient2);
                        //count[0]++;
                }
                return duplicatepatientsUniqueList.remove(patient2);
            }).collect(Collectors.toList()));

            System.out.println("Cat 3:");
            System.out.println(patientsQueue.stream().filter(patient3 -> {
                if ((patient3.isUnknownVirus()) && (patient3.getTemperature() < 38)) {
                       category3.add(patient3);
                        count[0]++;
                }
                return duplicatepatientsUniqueList.remove(patient3);
            }).collect(Collectors.toList()));


            System.out.println("Cat 4:");
            System.out.println(patientsQueue.stream().filter(patient4 -> {
                if ((patient4.isUnknownVirus()) && (patient4.getTemperature() < 38)) {
                       category4.add(patient4);
                       //count[0]++;
                }
                return duplicatepatientsUniqueList.remove(patient4);
            }).collect(Collectors.toList()));


            System.out.println("Count: "+ Arrays.toString(count));




            /*while (patientsQueueIterator.hasNext()) {


                // System.out.println(patient);//debugging

                Patient patient = patientsQueueIterator.next();


                if ((patient.getTemperature() >= 40 && patient.isUnknownVirus())
                        || (patient.getAge() >= 65 && patient.getTemperature() >= 38 && patient.isUnknownVirus())) {

                    //System.out.println(count+" cat1 "+patient+patient.hashCode());//debug
                    System.out.println(count[0]);
                    category1.add(patient);
                    System.out.println(patientsQueue.removeIf((patient)::equals));

                } else if ((patient.isUnknownVirus()) && (patient.getTemperature() >= 38)) {

                    // System.out.println(count+" cat2 "+patient+patient.hashCode());//debug
                    System.out.println(count[0]);
                    category2.add(patient);
                    System.out.println(patientsQueue.removeIf((patient)::equals));

                } else if ((patient.isUnknownVirus()) && (patient.getTemperature() < 38)) {

                    //System.out.println(count+" cat3 "+patient+patient.hashCode());//debug
                    System.out.println(count[0]);
                    category3.add(patient);
                    System.out.println(patientsQueue.removeIf((patient)::equals));

                } else if ((!patient.isUnknownVirus()) && (patient.getTemperature() >= 38)) {

                    //System.out.println(count+" cat4 "+patient+patient.hashCode());//debug
                    System.out.println(count[0]);
                    category4.add(patient);
                    System.out.println(patientsQueue.removeIf((patient)::equals));


                }
                count[0]++;

            } *///end loop. PROBLEEM met iteratie, de lus springt van 22 naar 26  en  van 29 naar 32!!!!s
            //Print zowel de resultaten van de Map af, als de inhoud van de Queue, die leeg moet zijn.
//Je kunt het volgende gebruiken voor over je Map te itereren.
//for(Map.Entry<Integer, List<Patient>> category : mapCollection.entrySet()){
//int key = category.getKey();

            System.out.println("Printing duplicatePatientsQueue: (after categorisation) ");

            System.out.println(duplicatepatientsUniqueList); // moet normaal leeg zijn = neen, er blijven 5 over!!!
            System.out.println("patientsQueue size: " + duplicatepatientsUniqueList.size());

            categoryQueue.put(category1, 1);
            categoryQueue.put(category2, 2);
            categoryQueue.put(category3, 3);
            categoryQueue.put(category4, 4);


            System.out.println("categoryqueue size:" + categoryQueue.size());
            System.out.println("category3 size:" + category3.size());

            System.out.println("Printing categoryQueue (HashMap: ");
            for (Map.Entry<List, Integer> category : categoryQueue.entrySet()) {
                List<Patient> key = category.getKey();
                int value = category.getValue();
                System.out.println("Patienten van categorie " + value + " :\n");
                System.out.println(key);
                System.out.println("===========================================");
            }


        }
        catch (ConcurrentModificationException exception) {
            exception.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }





        }
}
