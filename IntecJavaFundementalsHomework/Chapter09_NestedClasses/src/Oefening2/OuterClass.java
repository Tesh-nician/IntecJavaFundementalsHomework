package Oefening2;

import java.lang.reflect.MalformedParametersException;

public class  OuterClass implements MathFunctions{

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

      public class MathFunctions implements Oefening2.MathFunctions {

        public int sum(){

            return varA+varB;
        }
        public int min(){
            return varA<varB?varA:varB;
        }

        public int max(){
            return varA>varB?varA:varB;
        }

          @Override
          public double product() {
              return varA*varB;
          }

          @Override
          public double division() {
              //checking for DIV0!
              if (varB ==0) {
                  throw new IllegalArgumentException("Division by 0 error!");
              }

              else {
                  return (double) varA/varB;
              }
          }
      }

     @Override
     public double product() {
         return varA*varB;
     }

     @Override
     public double division() {
        //checking for DIV0!
        if (varB ==0) {
            throw new IllegalArgumentException("Division by 0 error!");
        }

        else {
            return (double) varA/varB;
        }
     }
 }
