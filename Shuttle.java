
public class Shuttle extends Spacecraft {

    Shuttle(String name, String originCountry, String propellant) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.propellant = propellant;
    }

    public static void setSample() {
        Shuttle sample1 = new Shuttle("Space Shuttle", "USA", "LH2 + LOX");
        Shuttle sample2 = new Shuttle("Saturn V", "USA", "RP1 + LOX");
        Shuttle sample3 = new Shuttle("Soyuz", "Russia", "RP1 + LOX");
        AddSpacecrafts.spacecraftList.add(sample1);
        AddSpacecrafts.spacecraftList.add(sample2);
        AddSpacecrafts.spacecraftList.add(sample3);
    }

    @Override
    public void propulse() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void landing() {
        // TODO Auto-generated method stub
        
    }
    


}
