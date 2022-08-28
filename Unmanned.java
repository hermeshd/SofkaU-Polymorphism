
public class Unmanned extends Spacecraft {

    Unmanned(String name, String originCountry, String combustible) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.combustible = combustible;
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
