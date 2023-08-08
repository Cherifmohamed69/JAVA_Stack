public class CarAndDriver {
    public static void main(String[] args) {
        Driver driver = new Driver(50.0);
        
        // Calling drive method four times
        for (int i = 0; i < 4; i++) {
            driver.drive();
        }
        
        // Calling boost method once
        driver.boost();
        
        // Calling refuel method three times
        for (int i = 0; i < 3; i++) {
            driver.refuel();
        }
        
        // Displaying final status
        driver.status();
    }
}
