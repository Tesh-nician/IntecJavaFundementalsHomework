package Project2;

import java.util.Arrays;

public class CustomerFactory {

    static final String[] NAMES = {"Deepika", "Elmaz", "Abdulrazak", "Maxime", "Mausam", "Haytam", "Jonathan"};


    static public AbstractCustomer getCustomer(String name) {

        return Arrays.asList(NAMES).contains(name)?new RealCustomer(name):new NulCustomer();

      /*
     for (String checkname : NAMES) {
            if (checkname.equals(name)) {return new RealCustomer(name);}
            else {return new NulCustomer();}
        }
       // error missing return ????  Als oplossing hiervoor gebruik ik de ternary hierboven.
       */
    }
}




