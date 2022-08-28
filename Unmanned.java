
public class Unmanned extends Spacecraft {

    Unmanned(String name, String originCountry, String propellant) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.propellant = propellant;
    }
    
    public static void setSample() {
        Unmanned sample1 = new Unmanned("Cassini-Huygens", "USA", "Cold gas");
        Unmanned sample2 = new Unmanned("Sputnik", "Russia", "None");
        Unmanned sample3 = new Unmanned("New Horizons", "USA", "Ion Thrusters");
        AddSpacecrafts.spacecraftList.add(sample1);
        AddSpacecrafts.spacecraftList.add(sample2);
        AddSpacecrafts.spacecraftList.add(sample3);
    }


    @Override
    public void propulse() {
       
        System.out.println("Turning on the ion thrusters");
        System.out.println("Fuel left (energy): " + 90);
    }
    
    public void landing() {
        System.out.println("Unmanned spacecraft don't really land :s (Unless it's a lander or a rover)");
    }
}
