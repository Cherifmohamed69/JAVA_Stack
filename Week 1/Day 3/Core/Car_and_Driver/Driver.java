class Driver extends Car {
    public Driver(double initialGas) {
        super(initialGas);
    }

    public void drive() {
        if (getGas() > 0) {
            System.out.println("Driving the car.");
            setGas(getGas() - 10); // Decrease gas by 10 units
        } else {
            System.out.println("The car is out of gas. Cannot drive.");
        }
    }

    public void boost() {
        if (getGas() >= 20) {
            System.out.println("Boosting the car.");
            setGas(getGas() - 20); // Decrease gas by 20 units
        } else {
            System.out.println("Not enough gas to boost.");
        }
    }

    public void refuel() {
        System.out.println("Refueling the car.");
        setGas(getGas() + 30); // Increase gas by 30 units
    }
}
