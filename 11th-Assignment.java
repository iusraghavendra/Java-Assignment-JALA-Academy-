package ThisAndSuperAssignment;

/**
 * Parent Class
 */

public class Parent {

    String company = "Bright IT";
    int companyId = 1001;

    public Parent() {

        System.out.println("Parent Default Constructor");
    }

    public Parent(String message) {

        System.out.println("Parent Parameterized Constructor");
        System.out.println("Message: " + message);
    }
}


package ThisAndSuperAssignment;

/**
 * Child Class
 */

public class Child extends Parent {

    String employeeName;
    int employeeId;

    // =====================================================
    // 3. Call Current Class Constructor using this()
    // =====================================================

    public Child() {

        this("John", 101);

        System.out.println("Child Default Constructor");
    }

    // =====================================================
    // 4. Call Argument Constructor using this()
    // =====================================================

    public Child(String employeeName, int employeeId) {

        // =================================================
        // 5. Call Parent Constructor using super()
        // =================================================

        super("Called from Child Constructor");

        this.employeeName = employeeName;
        this.employeeId = employeeId;

        System.out.println("Child Parameterized Constructor");
    }

    // =====================================================
    // 1. Print Current Class Fields using this
    // =====================================================

    public void printCurrentClassFields() {

        System.out.println("Using this Keyword:");

        System.out.println("Employee Name : "
                + this.employeeName);

        System.out.println("Employee ID   : "
                + this.employeeId);

        System.out.println();

        System.out.println("Without Object Reference:");

        System.out.println("Employee Name : "
                + employeeName);

        System.out.println("Employee ID   : "
                + employeeId);
    }

    // =====================================================
    // 2. Print Parent Class Fields using super
    // =====================================================

    public void printParentFields() {

        System.out.println("Parent Company : "
                + super.company);

        System.out.println("Parent Company ID : "
                + super.companyId);
    }

    // =====================================================
    // 6. Using this and super in Methods
    // =====================================================

    public void demonstrateThisAndSuperInMethod() {

        System.out.println("Using this inside method:");

        this.printCurrentClassFields();

        System.out.println();

        System.out.println("Using super inside method:");

        System.out.println(super.company);
        System.out.println(super.companyId);

        /*
         * Important:
         *
         * this() and super()
         * are constructor calls only.
         *
         * They CANNOT be used inside methods.
         *
         * Only this.variable, this.method(),
         * super.variable and super.method()
         * can be used inside methods.
         */
    }
}
