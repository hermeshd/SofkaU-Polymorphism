import java.util.Scanner;
//Necessary utilities for the program to work


public class Assignment {

    private static String selection;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws NumberFormatException, InterruptedException {

        //Populate stored spacecrafts with sample data
        Shuttle.setSample();
        Manned.setSample();  
        Unmanned.setSample();     
        
        //Display menu and get the user input
        System.out.println("Select action: "
                            +   "\n1. Add spacecrafts"
                            +   "\n2. See stored spacecrafts"
                            +   "\n3. Interact with stored spacecrafts"
                            +   "\n4. Exit");
        selection = input.nextLine();
        
        //Do what the user wants to do
        switch (selection) {
            case "1": 
                AddSpacecrafts.addSpacecrafts();
                break;
            case "2":                 
                SeeSpacecrafts.seeSpacecrafts();
                break;
            case "3":                 
                UseSpacecrafts.useSpacecrafts();
                break;
            case "4":                 
                System.exit(0);
                break;
        }
    } 
    
}
