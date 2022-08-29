public class SeeSpacecrafts {

    private static int i;
    
    //Method to see all the currently stored spacecrafts
    //Result is formatted in a table for better user readability
    public static void seeSpacecrafts() {
        String div = "-"; //Divisor for the table
        System.out.println(div.repeat(80)); //I just didn't want to type 80 times the divisor
        System.out.printf("%6s %20s %20s %20s %20s",                                    
                            "Index", "Type", "Name", "Country of Origin", "Propellant used"); //Table header, the first argument specifies the width of the table
        System.out.println(); //Blank space
        System.out.println(div.repeat(80));

        //For each spacecraft in the list, print out its properties
        for (Spacecraft spacecraft: AddSpacecrafts.spacecraftList) {
            System.out.format("%6d %20s %20s %20s %20s", 
                    i++, spacecraft.getClass().getSimpleName(), spacecraft.name, spacecraft.countryOfOrigin, spacecraft.propellant);
            System.out.println();
        }
        System.out.println(div.repeat(80));
    }
}
