package Oefening2;

public class NestedMain {
    public static void main(String[] args) {

        OuterClass newOuter = new OuterClass();
        newOuter.setVarA(100);
        newOuter.setVarB(200);

        OuterClass.MathFunctions newMath = newOuter.new MathFunctions();

        //Methodes uit de inner class
        System.out.println("minumum is: "+newMath.min());
        System.out.println("maximum is: "+newMath.max());
        System.out.println("sum is: "+newMath.sum());

        //Methodes uit de inner class die de interface implementeert
        System.out.println("Deze komen van de inner class(implementeert de interface):");
        System.out.println("var * varB is "+newMath.product());
        System.out.println("varA / varB is "+newMath.division());


        //Methodes uit de outer class die de interface implmenenteert
        System.out.println("Deze komen van de Outer Class(implementeert ook de interface):");
        System.out.println("var * varB is "+newOuter.product());
        System.out.println("varA / varB is "+newOuter.division());




    }
}
