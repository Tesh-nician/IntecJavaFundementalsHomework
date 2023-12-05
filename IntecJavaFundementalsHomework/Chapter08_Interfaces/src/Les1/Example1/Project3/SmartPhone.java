package Project3;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone implements ICamera,IGPS,IRadio,ISimCard,IWifi {

    //variables
    private static double PRICE = 200;
    private static String BRAND = "";
    private static int numberOfPhotos=0;

    private String[] photoCollection = new String[0];

    //constructor

    public SmartPhone(double price, String brand) {
        setPRICE(price);
        setBRAND(brand);
    }

    //getters and setters

    public static double getPRICE() {
        return PRICE;
    }

    public static void setPRICE(double PRICE) {
        SmartPhone.PRICE = PRICE;
    }

    public static String getBRAND() {
        return BRAND;
    }

    public static void setBRAND(String BRAND) {
        SmartPhone.BRAND = BRAND;
    }

    public static int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    public static void setNumberOfPhotos(int numberOfPhotos) {
        SmartPhone.numberOfPhotos = numberOfPhotos;
    }

    //methods from the interfaces


    @Override
    public void shootAPhoto(double amountOfPhotos) {
        setNumberOfPhotos(getNumberOfPhotos()+(int) amountOfPhotos); //upcasting int to double, test for errors!!!



        System.out.println("You have shot more photos.\nYour device now contains " + getNumberOfPhotos());
        Scanner myScanner = new Scanner(System.in);
        for (int loopcount=1;loopcount<=amountOfPhotos;loopcount++) {
            System.out.println("Please give a description of the new photo: ");
            //enlarge string array with Arrays.copyOf
            this.photoCollection = Arrays.copyOf(this.photoCollection, this.photoCollection.length + 1);
            // add description at the LAST index of the array
            this.photoCollection[this.photoCollection.length-1] = myScanner.nextLine();

        }

    }

    @Override
    public String viewPhotos() {

        return Arrays.toString(this.photoCollection);
    }

    @Override
    public String locate(double latitude, double longitude) {

        System.out.println("Your latitude is "+latitude+" and your longitude is "+longitude);

        System.out.println("Now converting to WGS84 and showing using Google maps");
        return null;
    }

    @Override
    public void navigate() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Where is your destination?");
        String destination = myScanner.nextLine();
        System.out.println("Sorry, you can't get to "+destination+" from here. Go somewhere else.");


    }

    @Override
    public void playChannel(double fm) {

        System.out.println("Now playing FM channel "+fm+" La la la la ....");

    }

    @Override
    public void changeChannel(double fm) {

        System.out.println("Changing channel to FM frequency " + fm);
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("You are now connected to WiFi router with SSID: "+internetConnection);



    }

    @Override
    public void disconnect(String internetConnection) {

        System.out.println("You are now disconnected from the internet");

    }

    //default methods from ISimCard

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }
}
