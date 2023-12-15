package Les1.Oefeningen.TestingOptionals;

import java.util.Optional;

public class CatMain {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Optional <Cat> myCat = findCatbyName("Fluffy");

        System.out.println(myCat.map(c->c.getName()).orElse("Tubby"));






    }

    private static Optional<Cat> findCatbyName (String name){

        Cat newCat = new Cat(name);

        return Optional.ofNullable(null);


    }

}