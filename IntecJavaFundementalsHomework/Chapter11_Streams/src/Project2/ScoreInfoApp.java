package Project2;

public class ScoreInfoApp {
    public static void main(String[] args) {
        ScoreInfoService newScoreInfoService = new ScoreInfoService();


        newScoreInfoService.addScoreInfo("Jonathan", "Deroo", 50);
        newScoreInfoService.addScoreInfo("Subrahmanyan", "Chandrasekhar", 89);
        newScoreInfoService.addScoreInfo("Karl", "Schwarzschild", 95);
        newScoreInfoService.addScoreInfo("John", "von Neumann", 94);
        newScoreInfoService.addScoreInfo("Wilhelm", "Leibniz", 59);
        newScoreInfoService.addScoreInfo("Charles", "Babbage", 90);


//druk het aantal leerlingen af (zonder gebruik te maken van
//scoreData.length)
        newScoreInfoService.getNumberOfStudents(newScoreInfoService.myStudentScores);


//druk de gemiddelde score voor alle leerlingen af
        newScoreInfoService.calculateAverageScore(newScoreInfoService.myStudentScores);


//druk het aantal studenten af die een A hebben gekregen (score groter
//dan of gelijk aan 90)
        newScoreInfoService.filterScore(newScoreInfoService.myStudentScores);


//gebruik de toArray() stream-bewerking om een String[] terug te geven
//die de namen bevat van leerlingen met een score van minder dan 60;
//de namen moeten in de vorm van voornaam gevolgd door achternaam
//zijn
        System.out.println("Leerlingen met minder dan 60%, als String[]:\n");
        int elements = 0;
        for (String name : newScoreInfoService.getFailedStudents(newScoreInfoService.myStudentScores)) {
            System.out.println(name);  }

        System.out.println("\n\n");



//druk de namen af van de lijst die in de vorige taak is gegenereerd
        newScoreInfoService.printFailingStudents(newScoreInfoService.myStudentScores);


//print de namen en scores van de student uit, geordend op de
//achternaam.
        newScoreInfoService.getDataSortedByLastName(newScoreInfoService.myStudentScores);


//print de namen en scores van de student uit, gerangschikt naar score
// getDataSortedByScore()
        newScoreInfoService.getDataSortedByScore(newScoreInfoService.myStudentScores);


// Test object toString:
//System.out.println("Test:\n"+newScoreInfoService.myStudentScores);
    }
}
