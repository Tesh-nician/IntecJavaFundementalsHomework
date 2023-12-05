package Project3;

import java.util.Scanner;

public class WhyPhoneApp {
    public static void main(String[] args) {

        showSpecs();
    }

    public static void showSpecs() {

        WhyPhone phone = new WhyPhone(250, "OnePlus NORD CE50", "black");
        Scanner newScanner = new Scanner(System.in);
        System.out.println("WhyPhone menu:\n1: ShootAPhoto\n2: ViewPhoto\n3:Locate\n4: Navigate\n5: FM player \n6: Change FM frequency\n7:Connect to Internet\n8: Disconnect from Internet");


        int selection = newScanner.nextInt();

        switch (selection) {
            case 1: {
                System.out.println("How many photos would you like to take?");
                int nPhotos = newScanner.nextInt();
                phone.shootAPhoto(nPhotos);
                break;

            }
            case 2: {
                phone.viewPhotos();
                break;
            }
            case 3: {
                System.out.println("Please enter WG84 coordinates:");
                double latitude = newScanner.nextDouble();
                double longitude = newScanner.nextDouble();
                phone.locate(latitude, longitude);
                break;
            }
            case 4: {
                phone.navigate();
                break;
            }

            case 5: {
                System.out.println("Please enter FM frequency:");
                phone.playChannel(newScanner.nextDouble());
                break;

            }
            case 6: {
                System.out.println("Please enter FM frequency:");
                phone.changeChannel(newScanner.nextDouble());
                break;
            }
            case 7: {
                newScanner.nextLine();
                System.out.println("Please enter name of Wifi SSID to which you want to connect:");
                phone.connect(newScanner.nextLine());
                break;
            }
            case 8: {
                newScanner.nextLine();
               // System.out.println("Please enter name of Wifi SSID from which you want to disconnect:");
                phone.disconnect("");
                break;
            }
            default: {
                System.out.println("Incorrect choice. ");
                showSpecs(); //
            }

        }
    }
}
