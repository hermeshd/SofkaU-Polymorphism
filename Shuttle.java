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

    //Normal procedure of a shuttle-like launch
    @Override
    public void propulse() throws InterruptedException {
        System.out.println("\nStarting countdown ...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Liftoff!! Now the spacecraft proceeds to launch its payload to orbit and beyond!");
        Thread.sleep(800);
        System.out.println("Staging of the spacecraft takes place and the remains burn and disintegrate back down to Earth\n");
    }

    //This is for reusable shuttle-like spacecraft (Currently only the Falcon 9 rocket can do this)
    public void propulse(String reusable) throws InterruptedException {
        System.out.println("\nStarting countdown ...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Liftoff!! Now the spacecraft proceeds to launch its payload to orbit and beyond!");
        Thread.sleep(800);
        System.out.println("Staging of the spacecraft takes place and the first stage turns around and executes the return burn");
        Thread.sleep(800);
        System.out.println("First stage starts falling back to earth and executes the re-entry burn");
        Thread.sleep(800);
        System.out.println("Now the first stage manuevers through the air and prepares for landing!\n");
    }

    @Override
    public void landing() throws InterruptedException {
        System.out.println("\nThe atmospheric stage(s) of the spacecraft start(s) falling back to earth and what doesn't get burned or disintegrated, splashes down in the ocean\n");
    }

    
    public static void landing(boolean reusable) throws InterruptedException {
        System.out.println("\nStarting countdown ...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Liftoff!! Now the spacecraft proceeds to launch its payload to orbit and beyond!");
        Thread.sleep(3000);
        System.out.println("Staging of the spacecraft takes place and the first stage turns around and executes the return burn");
        Thread.sleep(3000);
        System.out.println("First stage starts falling back to earth and executes the re-entry burn");
        Thread.sleep(3000);
        System.out.println("Now the first stage manuevers through the air and prepares for landing! ...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(3000);
        System.out.println("The first stage slows down to terminal velocity and aims for the landing pad ...");
        Thread.sleep(3000);
        System.out.println("Landing burn starts and landing legs start deploying ...");
        Thread.sleep(3000);
        System.out.println("Touchdown! First stage lands safely in the landing pad and soon the recovery team will get to it!\n");
    }
}
