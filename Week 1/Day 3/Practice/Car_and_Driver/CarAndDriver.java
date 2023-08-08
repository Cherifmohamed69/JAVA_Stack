public class CarAndDriver {
    public static void main(String[] args) {
        Driver driver = new Driver(50.0);
        
        for (int i = 0; i < 4; i++) {
            driver.drive();
        }
        
        driver.boost();
        
        for (int i = 0; i < 3; i++) {
            driver.refuel();
        }
        
        driver.status();
    }
}
