import java.util.ArrayList;
import java.util.Scanner;
//Necessary utilities for the program to work

public class AddSpacecrafts {

    private static String selection;
    public static ArrayList<Spacecraft> spacecraftList = new ArrayList<>(); //List of all the spacecrafts stored in the program
    
    Scanner input = new Scanner(System.in);

    //Method to add spacecrafts depending on user input
    public void addSpacecrafts() {

        //Ask the user for the type of spacecraft to add
        System.out.println("Enter the desired type of spacecraft: "
                            +   "\n1. Shuttle"
                            +   "\n2. Manned"
                            +   "\n3. Unmanned"
                            +   "\n4. Exit");
        selection = input.nextLine();

        //User selection menu
        System.out.println("Enter name of the spacecraft: ");
            String name = input.nextLine();
        System.out.println("Enter country or origin: ");
            String country = input.nextLine();
        System.out.println("Enter propellant type: ");
            String propellant = input.nextLine();
            
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
    }
}
