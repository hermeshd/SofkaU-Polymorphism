public class Unmanned extends Spacecraft {

    private int propellantAmount = 100;

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
        System.out.println("Turning on the ion thrusters and adjusting orbit");
        System.out.println("Fuel left (energy): " + (propellantAmount - 10));
    }
    
    public void landing() {
        System.out.println("Unmanned spacecrafts don't really land :s (Unless it's a lander or a rover)");
    }
}
