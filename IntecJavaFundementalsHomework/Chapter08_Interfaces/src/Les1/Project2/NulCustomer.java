package Project2_PostCardCollection;

public class NulCustomer extends AbstractCustomer {
    @Override
    boolean isNil() {
        return true;
    }

    @Override
    String getName() {
        return "Not available in the Customer Database.";
    }
}
