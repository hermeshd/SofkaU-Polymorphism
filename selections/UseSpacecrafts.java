import java.util.Scanner;

public class UseSpacecrafts {   
    
    static Scanner input = new Scanner(System.in);
    
    public static void useSpacecrafts() throws NumberFormatException, InterruptedException {

        SeeSpacecrafts.seeSpacecrafts();

        System.out.println("Type the index of the spacecraft you want to interact with: ");
        String selection = input.nextLine();
        System.out.println("The spacecraft you selected is: " + AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).name);
        System.out.println("\n");
        System.out.println("What do you want to do with this spacecraft?: "
                            +   "\n1. Propulse it forward"
                            +   "\n2. Land it");
        String action = input.nextLine();

        switch (action) {
            case "1":
                AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).propulse();
                break;
            case "2":
                AddSpacecrafts.spacecraftList.get(Integer.parseInt(selection)).landing();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
