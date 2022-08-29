import java.util.Scanner;

public class UseSpacecrafts {   
    
    static Scanner input = new Scanner(System.in);
    
    public static void useSpacecrafts() throws NumberFormatException, InterruptedException {

        SeeSpacecrafts.seeSpacecrafts(); //List the currently stored spacecrafts

        System.out.println("Type the index of the spacecraft you want to interact with: ");
        String selection = input.nextLine(); //User input to select one spacecraft to interact with
        System.out.println("The spacecraft you selected is: " + AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).name);
        System.out.println("\n"); //Confirm to the user the selected spacecraft
        String question = "What do you want to do with this spacecraft?: ";
        String typeOfSpacecraft = AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).getClass().getSimpleName(); //Store the type of the spacecraft in a variable

        //Available options are based on the type of spacecraft selected
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
    }
}
