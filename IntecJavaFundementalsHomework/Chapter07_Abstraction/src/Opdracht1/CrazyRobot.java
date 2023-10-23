package Opdracht1;

public class CrazyRobot extends Robot{

    private String crazyUnitName="";



    @Override
    public String toString() {
        return "Hi, I'm "+ crazyUnitName+ ",  a Craaaazy toboR!";
    }

    public CrazyRobot(String unitName) {
        //super(reverser(unitName)); //Error: must be on the first line????
        for (int i=(unitName.length()-1); i>=0; i--) {
            this.crazyUnitName=this.crazyUnitName+unitName.charAt(i);
        }
        setUnitName(crazyUnitName);//
        System.out.println(toString());
        boot();



    }
}
