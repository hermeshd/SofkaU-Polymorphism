
public class Manned extends Spacecraft {
    
    
    public int combustible = 100;

    @Override
    public void propulse() {
        this.combustible = combustible - 10;
        System.out.println("Used some cold gas to manuever the ship!");
        System.out.println("Fuel left (RCS): " + combustible);
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
