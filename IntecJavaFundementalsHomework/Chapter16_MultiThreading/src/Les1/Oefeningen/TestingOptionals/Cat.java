package Les1.Oefeningen.TestingOptionals;

public class Cat {

    String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
