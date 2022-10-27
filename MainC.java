import java.io.IOException;
import java.util.Scanner;

public class MainC {

    public static void main(String[] args) throws IOException {
        // Constructor
        Scanner scan = new Scanner(System.in);
        CopyBytes bytes = new CopyBytes();
        CopiaArchivos copy = new CopiaArchivos();
        clearScrean clear = new clearScrean();

        // Variables declaration
        int option = 0;
        String routeIn = "";
        String routeOut = "";

        clear.clear();
        System.out.println(
                "Please enter your option: \n1- Copy by Lines(Better for Text files)\n2- Copy by Bytes(Better for PDF, JPG, etc...)");
        option = scan.nextInt();
        switch (option) {
            case 1:
                clear.clear();
                System.out.print("Please enter file route to copy: ");
                routeIn = scan.next();
                System.out.print("Please enter your desire output File name: ");
                routeOut = scan.next();
                copy.CopiarLineas(routeIn, routeOut);
                System.out.println("File copied Succesfully!...");
                break;
            case 2:
                clear.clear();
                System.out.print("Please enter file route to copy: ");
                routeIn = scan.next();
                System.out.print("Please enter your desire File name: ");
                routeOut = scan.next();
                bytes.Bytes(routeIn, routeOut);
                System.out.println("File copied Succesfully!...");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }

}