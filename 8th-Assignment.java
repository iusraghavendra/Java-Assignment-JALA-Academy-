//Private 
package AccessModifiersAssignment.package1;

public class PrivateChild extends PrivateExample {

    public void testAccess() {

        /*
         * The following statements will cause
         * compilation errors because private
         * members are accessible only within
         * their own class.
         */

        // System.out.println(name);
        // display();

        System.out.println(
                "Private members cannot be accessed in subclass.");
    }
}

package AccessModifiersAssignment.package1;

public class PrivateExample {

    private String name = "Private Field";

    private void display() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        PrivateExample obj = new PrivateExample();

        System.out.println(obj.name);

        obj.display();
    }
}

//Default
package AccessModifiersAssignment.package1;

public class DefaultExample {

    String message = "Default Field";

    void display() {

        System.out.println("Default Method");
    }
}


//Protected
package AccessModifiersAssignment.package1;

public class ProtectedExample {

    protected String department = "Engineering";

    protected void showDepartment() {

        System.out.println("Protected Method");
    }
}

package AccessModifiersAssignment.package1;

public class ProtectedSamePackageDemo {

    public static void main(String[] args) {

        ProtectedExample obj = new ProtectedExample();

        System.out.println(obj.department);

        obj.showDepartment();
    }
}


//Public 

package AccessModifiersAssignment.package1;

public class PublicSamePackageDemo {

    public static void main(String[] args) {

        PublicExample obj = new PublicExample();

        System.out.println(obj.company);

        obj.displayCompany();
    }
}

package AccessModifiersAssignment.package1;

public class PublicExample {

    public String company = "Bright IT";

    public void displayCompany() {

        System.out.println("Public Method");
    }
}
