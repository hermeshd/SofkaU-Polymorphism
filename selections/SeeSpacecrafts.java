import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SeeSpacecrafts {

    static Scanner input = new Scanner(System.in);
    
    //Method to see all the currently stored spacecrafts
    //Result is formatted in a table for better user readability
    public static void seeSpacecrafts() throws NumberFormatException, InterruptedException {

        int i = 0; //Index counter for the table

        getLongestString(); //Calls the method to actively find the longest String in each column and size the table accordingly

        String div = "-"; //Divisor for the table
        System.out.println(div.repeat(maxStringCountries + maxStringNames + maxStringPropellants + 12 + 5)); //Dynamic size for the table separator
        System.out.printf("%-5s %-8s %-" + maxStringNames + "s %-" + maxStringCountries + "s %-" + maxStringPropellants + "s",                                    
                            "Index", "Type", "Name", "Country", "Propellant"); //Table header, the first argument specifies the width of each column which varies depending on the length of the largest stored value
        System.out.println(); //Blank space
        System.out.println(div.repeat(maxStringCountries + maxStringNames + maxStringPropellants + 12 + 5)); //Table separator

        //For each spacecraft in the list, print out its attributes
        for (Spacecraft spacecraft: AddSpacecrafts.spacecraftList) {
            System.out.format("%-5s %-8s %-" + maxStringNames + "s %-" + maxStringCountries + "s %-" + maxStringPropellants + "s", 
                    i++, spacecraft.getClass().getSimpleName(), spacecraft.name, spacecraft.countryOfOrigin, spacecraft.propellant); //Get attributes of each spacecraft
            System.out.println();
        }
        System.out.println(div.repeat(maxStringCountries + maxStringNames + maxStringPropellants + 12 + 5)); //Table separator, yet again       
    }

    //Variables to store the longest stored String of each attribute, the default values are the lengths of the table headers
    public static int maxStringNames = 4;
    public static int maxStringCountries = 7;
    public static int maxStringPropellants = 10;

    //Method to find the longest string in each attribute
    private static void getLongestString() {

        //Arrays to store all the different values of each spacecraft attribute
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<String> propellants = new ArrayList<>(); 
        
        //Iterates through every Spacecraft object and gets the values of the attributes
        for (Spacecraft spacecraft: AddSpacecrafts.spacecraftList) {
            names.add(spacecraft.name);
            countries.add(spacecraft.countryOfOrigin);
            propellants.add(spacecraft.propellant);
        }

        //Gets longest string in the column, it could be either one of the values or the header itself
        if (Collections.max(names, Comparator.comparing(String::length)).length() > 4) {
            maxStringNames = Collections.max(names, Comparator.comparing(String::length)).length();
        }
        
        if (Collections.max(countries, Comparator.comparing(String::length)).length() > 7) {
            maxStringCountries = Collections.max(countries, Comparator.comparing(String::length)).length();
        }

        if (Collections.max(propellants, Comparator.comparing(String::length)).length() > 10) {
            maxStringPropellants = Collections.max(propellants, Comparator.comparing(String::length)).length();
        }
    }
}
