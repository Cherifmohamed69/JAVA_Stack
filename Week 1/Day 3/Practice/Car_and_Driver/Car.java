class Car {
    private double gas;

    public Car(double initialGas) {
        gas = initialGas;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double newGas) {
        gas = newGas;
    }

    public void status() {
        System.out.println("Gas amount: " + gas);
        if (gas > 0) {
            System.out.println("The car has gas.");
        } else {
            System.out.println("The car is out of gas.");
        }
    }
}
