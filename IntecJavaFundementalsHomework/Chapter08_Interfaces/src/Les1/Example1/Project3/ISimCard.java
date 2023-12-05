package Project3;

public interface ISimCard {
    default public void startCall (String number) {
        System.out.println(number.equals("")?"Calling 911":"Now calling: "+ number);
    }

    default public void endCall() {
        System.out.println("Call ended");
    }
}
