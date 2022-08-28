
public class Unmanned extends Spacecraft {

    public int combustible = 100;
    
    @Override
    public void propulse() {
        this.combustible = combustible - 10;
        System.out.println("Turning on the ion thrusters");
        System.out.println("Fuel left (energy): " + 90);
    }
    
    public void landing() {
        System.out.println("Unmanned spacecraft don't really land :s (Unless it's a lander or a rover)");
    }
}
