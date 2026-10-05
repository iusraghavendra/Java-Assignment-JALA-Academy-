/**
 * Super Class A
 */

public class A {

    // Instance Variable
    String name = "Class A Variable";

    // Specific Method 1
    public void methodA1() {

        System.out.println("Method A1");
    }

    // Specific Method 2
    public void methodA2() {

        System.out.println("Method A2");
    }

    // Overridden Method
    public void display() {

        System.out.println("Display Method from Class A");
    }
}

/**
 * Class B extends A
 */

public class B extends A {

    // Instance Variable
    String name = "Class B Variable";

    // Specific Method 1
    public void methodB1() {

        System.out.println("Method B1");
    }

    // Specific Method 2
    public void methodB2() {

        System.out.println("Method B2");
    }

    // Overridden Method
    @Override
    public void display() {

        System.out.println("Display Method from Class B");
    }
}


/**
 * Class C extends B
 */

public class C extends B {

    // Instance Variable
    String name = "Class C Variable";

    // Specific Method 1
    public void methodC1() {

        System.out.println("Method C1");
    }

    // Specific Method 2
    public void methodC2() {

        System.out.println("Method C2");
    }

    // Overridden Method
    @Override
    public void display() {

        System.out.println("Display Method from Class C");
    }
}
