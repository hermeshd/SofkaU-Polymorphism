public class Unmanned extends Spacecraft {

    private int propellantAmount;

    Unmanned(String name, String originCountry, String propellant) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.propellant = propellant;
        this.propellantAmount = 100;
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
        System.out.println("\nTurning on the ion thrusters and adjusting orbit");
        this.propellantAmount = this.propellantAmount - 10;
        if (this.propellantAmount >= 0) {
            System.out.println("Fuel left (energy): " + this.propellantAmount + "\n");
        } else {
            System.out.println("Oh no! " + this.name + " has ran out of fuel");
        }
    }
    
    public void landing() {
        System.out.println("\nUnmanned spacecrafts don't really land :s (Unless it's a lander or a rover)");
    }
}
