package Project2;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) { this.name=name;
    }

    @Override
    boolean isNil() {
        return false;
    }

    @Override
    String getName() {
        return name+" is a customer.";
    }
}
