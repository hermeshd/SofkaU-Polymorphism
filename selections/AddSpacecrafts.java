import java.util.ArrayList;
import java.util.Scanner;

public class AddSpacecrafts {

    private static String selection;
    public static ArrayList<Shuttle> shuttleList = new ArrayList<>();
    public static ArrayList<Manned> mannedList = new ArrayList<>();
    public static ArrayList<Unmanned> unmannedList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addSpacecrafts() {

        System.out.println("Enter the desired type of spacecraft: "
                            +   "\n1. Shuttle"
                            +   "\n2. Manned"
                            +   "\n3. Unmanned"
                            +   "\n4. Exit");
        selection = input.nextLine();
            
        switch (selection) {

            case "1":
                System.out.println("Enter name: ");
                String sName = input.nextLine();
                System.out.println("Enter country: ");
                String sCountry = input.nextLine();
                System.out.println("Enter combustible: ");
                String sCombustible = input.nextLine();

                Shuttle shuttle = new Shuttle(sName, sCountry, sCombustible);
                shuttleList.add(shuttle);
                break;
            case "2":
                System.out.println("Enter name: ");
                String mName = input.nextLine();
                System.out.println("Enter country: ");
                String mCountry = input.nextLine();
                System.out.println("Enter combustible: ");
                String mCombustible = input.nextLine();

                Manned manned = new Manned(mName, mCountry, mCombustible);
                mannedList.add(manned);
                break;
            case "3":
                System.out.println("Enter name: ");
                String uName = input.nextLine();
                System.out.println("Enter country: ");
                String uCountry = input.nextLine();
                System.out.println("Enter combustible: ");
                String uCombustible = input.nextLine();

                Unmanned unmanned = new Unmanned(uName, uCountry, uCombustible);
                unmannedList.add(unmanned);
                break;
            case "4":
                System.exit(0);
            case "5":
                System.out.println(shuttleList);
                // System.out.println(((Shuttle) shuttleList.get(0)).name);
                break;
        }
    }
}
