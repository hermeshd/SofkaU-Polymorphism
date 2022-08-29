public abstract class Spacecraft {
    
    public String name;
    public String countryOfOrigin;
    public String propellant;

    public abstract void propulse() throws InterruptedException;

    public abstract void landing() throws InterruptedException;;
}
