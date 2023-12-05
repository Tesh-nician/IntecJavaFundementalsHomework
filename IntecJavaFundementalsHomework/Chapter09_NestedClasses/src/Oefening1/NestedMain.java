package Oefening1;

public class NestedMain {
    public static void main(String[] args) {

        OuterClass newOuter = new OuterClass();
        newOuter.setVarA(100);
        newOuter.setVarB(200);

        OuterClass.MathFunctions newMath = newOuter.new MathFunctions();

        System.out.println("minumum is: "+newMath.min());
        System.out.println("maximum is: "+newMath.max());
        System.out.println("sum is: "+newMath.sum());


    }
}
