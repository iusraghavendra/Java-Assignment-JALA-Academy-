/**
 * =========================================================
 * Abstract Class
 * =========================================================
 */

public abstract class Animal {

    // Abstract Method
    public abstract void makeSound();

    // Non-Abstract Method
    public void sleep() {

        System.out.println("Animal is sleeping.");
    }

    // Another Non-Abstract Method
    public void eat() {

        System.out.println("Animal is eating.");
    }
}


/**
 * =========================================================
 * Child Class
 * =========================================================
 */

public class Dog extends Animal {

    // Implementing Abstract Method
    @Override
    public void makeSound() {

        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {

        // =================================================
        // 2. Create Object Using Abstract Class Reference
        // =================================================

        System.out.println("===== Abstract Reference =====");

        Animal animal = new Dog();

        // Calling Non-Abstract Methods
        animal.sleep();
        animal.eat();

        System.out.println("\n===================================\n");

        // =================================================
        // 3. Create Child Class Object
        // Call Abstract Method
        // =================================================

        System.out.println("===== Child Object - Abstract Method =====");

        Dog dog = new Dog();

        dog.makeSound();

        System.out.println("\n===================================\n");

        // =================================================
        // 4. Create Child Class Object
        // Call Non-Abstract Methods
        // =================================================

        System.out.println("===== Child Object - Non-Abstract Methods =====");

        dog.sleep();

        dog.eat();

        System.out.println("\n===================================\n");
    }
}
