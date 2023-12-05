package Oefening1;

 public class OuterClass {

    int varA;
    int varB;


    public void setVarA(int varA) {
        this.varA = varA;
    }

    public void setVarB(int varB) {
        this.varB = varB;
    }

     public int getVarA() {
         return varA;
     }

     public int getVarB() {
         return varB;
     }

      public class MathFunctions {

        public int sum(){

            return varA+varB;
        }
        public int min(){
            return varA<varB?varA:varB;
        }

        public int max(){
            return varA>varB?varA:varB;
        }
    }

}
