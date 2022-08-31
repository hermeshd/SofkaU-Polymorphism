import java.util.ArrayList;
import java.util.Scanner;
//Necessary utilities for the program to work

public class AddSpacecrafts {

    public static ArrayList<Spacecraft> spacecraftList = new ArrayList<>(); //List of all the spacecrafts stored in the program
    
    static Scanner input = new Scanner(System.in);

    //Method to add spacecrafts depending on user input
    public static void addSpacecrafts() throws NumberFormatException, InterruptedException {

        //Ask the user for the type of spacecraft to add
        System.out.println("Enter the desired type of spacecraft: "
                            +   "\n1. Shuttle"
                            +   "\n2. Manned"
                            +   "\n3. Unmanned"
                            +   "\n4. Exit");
        String selection = input.nextLine();
        String name = null;
        String country = null;
        String propellant = null;
        
        //User selection menu
        if (selection.equals("4")) {
            System.exit(0);
        } else {
            System.out.print("\n");
            System.out.println("Enter name of the spacecraft: ");
                name = input.nextLine();
            System.out.println("Enter country or origin: ");
                country = input.nextLine();
            System.out.println("Enter propellant type: ");
                propellant = input.nextLine();
        }

        //Evaluate user selection and add spacecraft according to the type
        switch (selection) {

            case "1":
                spacecraftList.add(new Shuttle(name, country, propellant));
                break;
            case "2":
                spacecraftList.add(new Manned(name, country, propellant));
                break;
            case "3":
                spacecraftList.add(new Unmanned(name, country, propellant));
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
        }
        System.out.println("\nSpacecraft added successfully!");
        System.out.println("\nPress ENTER to continue...");
        input.nextLine();
        System.out.print("\033\143"); //Clear console
        Assignment.main(null);
    }
}
