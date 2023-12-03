package Project2;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class PostCardApp {
    public static void main(String[] args) {

        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo","Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");


        List<PostCard> yourPostCardList = new ArrayList();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);
//your friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");
        List<PostCard> yourFriendsPostCardList = new ArrayList();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);
//your friends
        Friend bobby = new Friend("Bobby",false, 3, 5);
        Friend melissa = new Friend("Melissa",false, 1, 6);
        Friend darla = new Friend("Darla",true, 14, 2);
        Friend bert = new Friend("Bert",false, 10, 4);
        Friend grandma = new Friend("Nana",true, 12, 7);
        Friend fester = new Friend("Fester",false, 1, 2);
        Friend anna = new Friend("Anna",false, 8, 4);



        System.out.println("***************************************************************************************************************\nOPDRACHT 1:");
        System.out.println("OPDRACHT 1:");
        //Opdracht1
        //Je beste vriend heeft een paar kaarten die je graag met hem zou willen ruilen. Hij vindt het
        //goed, zolang je alleen maar dubbeltjes van hem vraagt.
        //Jij hebt een systeem voor alles dat je ruilt: graag plaats jij de nieuwe kaart op dezelfde plaats
        //als de kaart dat je net weg ruilde. (INDEX!)
        //Jouw vriend kan het niet echt schelen, zolang hij maar zijn nieuwe kaart krijgt.
        //Zorg ervoor dat deze ruil gebeurt.

        //swapping using temp object:


        //swapping belgium4 with northKorea2
        System.out.println(yourPostCardList+"\n"+yourFriendsPostCardList);
        int yourSwapIndex= yourPostCardList.indexOf(belgium4); //eerst index vinden van belgium4
        int hisSwapIndex= yourFriendsPostCardList.indexOf(northKorea2); //idem voor northkorea2
        PostCard tempHisCard = yourFriendsPostCardList.get(hisSwapIndex); //creating temp
        PostCard tempYourCard = yourPostCardList.get(yourSwapIndex); //creating temp
        yourPostCardList.remove(yourSwapIndex); //verwijderen op de gevonden index
        yourFriendsPostCardList.remove(hisSwapIndex); //verwijderen op de gevonden index
        yourPostCardList.add(yourSwapIndex,tempHisCard); //temp toevoegen op de gevonden index
        yourFriendsPostCardList.add(hisSwapIndex,tempYourCard); //temp toevoegen op de gevonden index

        //swapping belgium3 with usa2
        yourSwapIndex= yourPostCardList.indexOf(belgium3);
        hisSwapIndex= yourFriendsPostCardList.indexOf(usa2);
        tempHisCard = yourFriendsPostCardList.get(hisSwapIndex);
        tempYourCard = yourPostCardList.get(yourSwapIndex);
        yourPostCardList.remove(yourSwapIndex);
        yourFriendsPostCardList.remove(hisSwapIndex);
        yourPostCardList.add(yourSwapIndex,tempHisCard);
        yourFriendsPostCardList.add(hisSwapIndex,tempYourCard);




        System.out.println("Opdracht1:nadien");
        System.out.println(yourPostCardList+"\n"+yourFriendsPostCardList);


        System.out.println("***************************************************************************************************************\nOPDRACHT 2:");
        //Opdracht2
        //Je beslist toch je systeem aan te passen en wilt al je kaarten sorteren per land. Gebruik hiervoor een
        //Comparator!
        //Print het resultaat uit.

        System.out.println("Opracht2 (niet gesorteerd) "+ yourPostCardList );

        yourPostCardList.sort(Comparator.comparing(PostCard::getCountry));
        System.out.println("Opdracht2 (gesorteerd) "+yourPostCardList);



        System.out.println("***************************************************************************************************************\nOPDRACHT 3:");

        //Opdracht3
        //Je systeem is nog niet optimaal genoeg, en je beslist je dubbeltjes uit je hoop kaarten te halen.
        //Maak een methode die kijkt hoeveel kaarten je van een bepaald land hebt, en de extras dan toevoegt
        //aan een nieuwe List. Zorg ervoor dat de dubbele kaarten niet meer in de oude lijst zijn. Print dan uit
        //hoeveel dubbele kaarten je hebt in de nieuwe lijst.
        //HINT: gebruik Collections.frequency();
        //HINT2: Een Set kan ook helpen;
        //Print dan het resultaat uit.









        //make Set copy of original list (so no duplicates will appear in this list!), Treeset to provide some sorting.
        TreeSet<PostCard> originalNoDuplicateList = new TreeSet<>((PostCard p1,PostCard p2) -> p1.country.compareTo(p2.country)); //Gevonden https://www.geeksforgeeks.org/creating-treeset-with-comparator-by-user-define-objects-in-java/
        originalNoDuplicateList.addAll(yourPostCardList);

        //make a copy of original postcard list and sort it (easier for debugging)
        List<PostCard>copyOfOriginalList = yourPostCardList;
        copyOfOriginalList.sort(Comparator.comparing(PostCard::getCountry));

        //System.out.println("TreeSet copy of original list: \n"+originalNoDuplicateList);// for debugging

        //iterate through set and remove the originals from the list with duplicates
        originalNoDuplicateList.forEach(copyOfOriginalList::remove);

        //this leaves only the duplicates in the list
        System.out.println("list of duplicate cards: \n"+copyOfOriginalList);

        System.out.println("Duplicates per country: ");
        copyOfOriginalList.stream().distinct().forEach(postCard -> {
            System.out.println(postCard.country + " "+ Collections.frequency(copyOfOriginalList,postCard));});





        System.out.println("***************************************************************************************************************\nOPDRACHT 4:");

        //Opdracht4
        //Je komt erachter dat kaarten verzamelen eigenlijk niet meer in de mode is en je beslist ze weg te geven
        //aan al je vrienden.
        //Je hebt hier ook een systeem voor. Je wilt hier dit keer niet te veel code voor gebruiken, het gaat toch
        //maar om kaarten die je niet meer gaat verzamelen.
        //Maak een ProrityQueue die ‘sortedFriends’ heet aan die aan de hand van lambdas eerst
        //prioriteit geeft aan je familieleden, dan aan je beste vriend en dan pas aan de mensen die je
        //het langste kent. Vul de queue dan aan met het volgende:

       PriorityQueue<Friend> sortedFriend = new PriorityQueue<Friend>(Comparator.comparing(Friend::isFamily)
               .thenComparing(Friend::getFriendShipLevel)
               .thenComparing(Friend::getYearsKnown));

        sortedFriend.offer(bobby);
        sortedFriend.offer(melissa);
        sortedFriend.offer(darla);
        sortedFriend.offer(bert);
        sortedFriend.offer(grandma);
        sortedFriend.offer(fester);
        sortedFriend.offer(anna);
       // System.out.println(sortedFriend.stream().collect(Collectors.toList())); // werkt niet
        //System.out.println(sortedFriend); // werkt niet
        //De oplossing: https://stackoverflow.com/questions/25569625/sorting-priority-queue-in-java
        //Bevestiging: https://stackoverflow.com/questions/1795527/how-is-the-java-priority-queue-supposed-to-work

        while (!sortedFriend.isEmpty()) { System.out.println(sortedFriend.poll());}


    }

}
