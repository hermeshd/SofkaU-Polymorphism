import java.util.Scanner;

public class UseSpacecrafts {   
    
    static Scanner input = new Scanner(System.in);
    
    public static void useSpacecrafts() throws NumberFormatException, InterruptedException {

        SeeSpacecrafts.seeSpacecrafts(); //List the currently stored spacecrafts

        System.out.println("Type the index of the spacecraft you want to interact with: ");
        String selection = input.nextLine(); //User input to select one spacecraft to interact with
        
        //Check if the input option is valid
        try {
            if (Integer.parseInt(selection) > SeeSpacecrafts.getIndexCounter()) {
                System.out.println("Invalid Option");
                System.out.println("Press ENTER to continue...");
                input.nextLine();
                System.out.print("\033\143"); //Clear console
                Assignment.main(null);
            }
        } 
        
        catch (NumberFormatException e) {
            System.out.println("Invalid Option");
                System.out.println("Press ENTER to continue...");
                input.nextLine();
                System.out.print("\033\143"); //Clear console
                Assignment.main(null);
        }

        System.out.print("\033\143"); //Clear console
        System.out.println("The spacecraft you selected is: " + AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).name);
        System.out.println("\n"); //Confirm to the user the selected spacecraft
        String question = "What do you want to do with this spacecraft?: ";
        String typeOfSpacecraft = AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).getClass().getSimpleName(); //Store the type of the spacecraft in a variable

        //Submenu with available options are based on the type of spacecraft selected
        switch (typeOfSpacecraft) {
            case "Shuttle":
                question = question + "\n1. Launch it \n2. Land it \n3. Launch it and then land it"; //The shuttles are the only type of spacecraft with 3 available actions
                break;
            case "Manned":
                question = question + "\n1. Propel it in any direction \n2. Land it";
                break;
            case "Unmanned":
                question = question + "\n1. Propel it in any direction \n2. Land it";
                break;
            default:
                System.out.println("Invalid option");
        }

        System.out.println(question); //Display the question + the corresponding options
        String action = input.nextLine(); //Getting user input
        System.out.print("\033\143"); //Clear console
        System.out.println("Selected spacecraft: " + AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).name);
        SeeSpacecrafts.getIndexCounter();

        //Executing the selected action according to the user selection
        switch (action) {
            case "1":
                AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).propulse();
                break;
            case "2":
                AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).landing();
                break;
            case "3":
                Shuttle.landing(true); //This action is exclusive for the Shuttle type of spacecraft
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("Press ENTER to continue...");
        input.nextLine();
        System.out.print("\033\143"); //Clear console
        Assignment.main(null);
    }
}
