public class Manned extends Spacecraft {

    private int propellantAmount = 100;
    
    Manned(String name, String originCountry, String propellant) {
        this.name = name;
        this.countryOfOrigin = originCountry;
        this.propellant = propellant;
        this.propellantAmount = 100;
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
        System.out.println("\nUsed some cold gas to manuever the ship!");
        this.propellantAmount = this.propellantAmount - 10;
        if (this.propellantAmount >= 0) {
            System.out.println("Fuel left (RCS): " + this.propellantAmount + "\n");
        } else {
            System.out.println("Oh no! " + this.name + " has ran out of fuel");
        }
    }

    @Override
    public void landing() throws InterruptedException {
        System.out.println("\nDeploying drogue parachute ...");
        Thread.sleep(1500);
        System.out.println("Deploying landing legs as the spacecraft approaches the ground ...");
        Thread.sleep(1500);
        System.out.println("Deploying main parachute and bracing for landing/splashdown ...");
        Thread.sleep(1500);
        System.out.println("Touchdown! Now the people on board are waiting for the recovery team to pick them up!\n");
    }
}
