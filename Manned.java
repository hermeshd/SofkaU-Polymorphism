
public class Manned extends Spacecraft {
    
    
    Manned(String name, String originCountry, String propellant) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.propellant = propellant;
    }

    public static void setSample() {
        Manned sample1 = new Manned("Dragon V2", "USA", "Cold gas");
        Manned sample2 = new Manned("Soyuz capsule", "Russia", "Cold gas");
        Manned sample3 = new Manned("Apollo", "USA", "Cold gas");
        AddSpacecrafts.spacecraftList.add(sample1);
        AddSpacecrafts.spacecraftList.add(sample2);
        AddSpacecrafts.spacecraftList.add(sample3);
    }

    @Override
    public void propulse() {
        
        System.out.println("Used some cold gas to manuever the ship!");
        System.out.println("Fuel left (RCS): " + propellant);
    }

    @Override
    public void landing() {
        
    }

    // public void landing() throws InterruptedException {
    //     System.out.println("Opening up parachute...");
    //     Thread.sleep(1000);
    //     System.out.println("Bracing for impact on the ocean...");
    //     Thread.sleep(1000);
    //     System.out.println("Splashdown and now waiting for recovery team!");
    // }

    // public void landing(String method) throws InterruptedException {
        
    //     if (method == "powered") {
    //         System.out.println("Opening up drogue parachute...");
    //         Thread.sleep(1000);
    //         System.out.println("Performing suicide burn...");
    //         Thread.sleep(1000);
    //         System.out.println("Deploying landing legs ...");
    //         Thread.sleep(1000);
    //         System.out.println("Touchdown and now waiting for recovery team!!");
    //     }
    //}

}
