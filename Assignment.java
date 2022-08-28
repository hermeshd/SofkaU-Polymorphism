import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment {

    public static ArrayList<Shuttle> spaceships = new ArrayList<>();
    public static String selection;

    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner(System.in);
       
        while (selection != "4") {
            System.out.println("Enter the desired type of spacecraft: "
                            +   "\n1. Shuttle"
                            +   "\n2. Manned"
                            +   "\n3. Unmanned"
                            +   "\n4. Exit");
            selection = input.nextLine();
            
            switch (selection) {

                case "1":
                    System.out.println("Enter name: ");
                    String name = input.nextLine();
                    System.out.println("Enter country: ");
                    String country = input.nextLine();
                    System.out.println("Enter combustible: ");
                    String combustible = input.nextLine();

                    Shuttle shuttle = new Shuttle(name, country, combustible);
                    spaceships.add(shuttle);
                    break;
                case "4":
                    System.exit(0);
                case "5":
                    System.out.println(((Shuttle) spaceships.get(0)).name);
                    break;
            }
        }

    }
    
}
