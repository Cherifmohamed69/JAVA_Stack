class Mammal {
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}

class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("Gorilla has thrown something!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla is satisfied after eating bananas.");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree.");
        energyLevel -= 10;
    }
}

class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        for (int i = 0; i < 3; i++) {
            gorilla.throwSomething();
        }
        for (int i = 0; i < 2; i++) {
            gorilla.eatBananas();
        }
        gorilla.climb();
        gorilla.displayEnergy();
    }
}

class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("Sound of a bat taking off.");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat has eaten a human.");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Sound of a town on fire.");
        energyLevel -= 100;
    }
}

class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        for (int i = 0; i < 3; i++) {
            bat.attackTown();
        }
        for (int i = 0; i < 2; i++) {
            bat.eatHumans();
        }
        for (int i = 0; i < 2; i++) {
            bat.fly();
        }
        bat.displayEnergy();
    }
}
