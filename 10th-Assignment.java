package InterfacesAssignment;

public interface InterfaceOne {

    void display();
}

package InterfacesAssignment;

public interface InterfaceTwo {

    void methodOne();

    void methodTwo();
}


package InterfacesAssignment;

public interface InterfaceA {

    void commonMethod();
}


package InterfacesAssignment;

public interface InterfaceB {

    void commonMethod();
}


package InterfacesAssignment;

public interface ParentInterface {

    void parentMethod();
}


package InterfacesAssignment;

public interface PartialInterface {

    void show();

    default void display() {

        System.out.println("Default Method in Interface");
    }
}


package InterfacesAssignment;

public interface PublicInterface {

    // Interface fields are automatically
    // public static final

    String COMPANY = "Bright IT";
    int YEAR = 2025;

    void companyInfo();
}


package InterfacesAssignment;

public interface StaticFinalInterface {

    int MAX_VALUE = 100;
}


package InterfacesAssignment;

public interface ChildInterface extends ParentInterface {

    void childMethod();
}
