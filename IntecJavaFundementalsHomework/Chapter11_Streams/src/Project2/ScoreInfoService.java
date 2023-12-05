package Project2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfoService {
    ScoreInfo scoreData; //contains score data of individual students;
    long numberOfStudents; //obtain via stream().count?? used for average score.

    List<ScoreInfo> myStudentScores = new ArrayList<ScoreInfo>();
    public ScoreInfoService() {}


    public void addScoreInfo(String firstName, String lastName, int score) {

        ScoreInfo newScoreInfo = new ScoreInfo(new Student(firstName,lastName),score);
        myStudentScores.add(newScoreInfo);
    }

    //getNumberOfStudents()
    //- druk het aantal leerlingen af (zonder gebruik te maken van
    //scoreData.length)

    public void getNumberOfStudents(List<ScoreInfo> studentScores){

        System.out.println("Total number of students: "+studentScores.stream().count()+"\n\n");
    }


    //calculateAverageScore()
    //- druk de gemiddelde score voor alle leerlingen af
    public void calculateAverageScore(List<ScoreInfo> studentScores) {

        int totalScores = studentScores.stream()
                .map(s->s.score)
                .reduce(0, (Integer s1,Integer s2) ->s1+s2);
        long aantalStudenten = studentScores.stream().count();

        System.out.println("Average score: "+totalScores/aantalStudenten+" %\n\n");
    }

//filterScore()
//- druk het aantal studenten af die een A hebben gekregen (score groter
//dan of gelijk aan 90)

    public void filterScore(List<ScoreInfo> studentScores){

        System.out.println("Students with scores over or equal to 90%: \n"+
                studentScores.stream()
                        .filter(s->s.score>=90)
                        .collect(Collectors.toList())+"\n\n");
    }
    //String[] getFailedStudents()
//- gebruik de toArray() stream-bewerking om een String[] terug te geven
//die de namen bevat van leerlingen met een score van minder dan 60;
//de namen moeten in de vorm van voornaam gevolgd door achternaam
//zijn
    public String[] getFailedStudents(List<ScoreInfo> studentScores){
        return studentScores.stream()
                .filter(s->s.score<60)
                .map(scoreInfo -> scoreInfo.name+" "+ scoreInfo.lastName).toArray(String[]::new);
    }


    // druk de namen af van de lijst die in de vorige taak is gegenereerd
    public void printFailingStudents(List<ScoreInfo> studentScores){

        System.out.println("Students with a score < 60%:"
                +studentScores.stream()
                .filter(s->s.score<60)
                .map(scoreInfo -> scoreInfo.name+" "+ scoreInfo.lastName)
                .collect(Collectors.toList())+"\n\n");

    }

    //getDataSortedByLastName()
    //- print de namen en scores van de student uit, geordend op de
    //achternaam.
    public void getDataSortedByLastName(List<ScoreInfo> studentScores) {

        System.out.println("Students sorted by their last name: \n"
                +studentScores.stream()
                .sorted(Comparator.comparing(scoreInfo -> scoreInfo.lastName))
                .collect(Collectors.toList())+"\n\n");
    }

    // getDataSortedByScore()
//- print de namen en scores van de student uit, gerangschikt naar score
    public void getDataSortedByScore(List<ScoreInfo> studentScores) {

        System.out.println("Students sorted by their score: \n"
                +studentScores.stream()
                .sorted(Comparator.comparing(scoreInfo -> scoreInfo.score))
                .collect(Collectors.toList())+"\n\n");
    }
}
