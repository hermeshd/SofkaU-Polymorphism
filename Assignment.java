import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

        private static String selection;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Select action: "
                            +   "\n1. Add spacecrafts"
                            +   "\n2. See stored spacecrafts"
                            +   "\n3. Interact with stored spacecrafts"
                            +   "\n4. Exit");
            selection = input.nextLine();
       
        while (selection != "4") {

            switch (selection) {
                case "1": 
                    AddSpacecrafts addSpacecrafts = new AddSpacecrafts();
                    addSpacecrafts.addSpacecrafts();
                    break;
                }
        }

    }
    
}
