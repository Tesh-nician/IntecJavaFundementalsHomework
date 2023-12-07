package Les1.Example1;

public class ExampleJoin {
    public static void main(String[] args) {

        try {
            Thread studeren = new Thread( new MijnThread());
            Thread gamen = new Thread( new MijnThread());
            Thread eten = new Thread( new MijnThread());

            studeren.start();

            studeren.join(1000);

            gamen.start();

            gamen.join();

            eten.start();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
