public class Abstract_InterfacesLesson {

    public static void main(String[] args) {
//      'Employee' is abstract; cannot be instantiated
//      Employee newGuys = new Employee("Bob", "Receiving");
        Developer newGuy = new Developer("Frank", "Front-end");
        System.out.println(newGuy.work());

    }

}

// Set generic properties and methods that will not be accessed directly
// rather inherited by another class(es)
abstract class Employee {
//  Fields
    protected String name;
    protected String department;

//  GET/SET
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

//  Methods
    public abstract String work();

//  Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class Developer extends Employee {
//  Methods
    public String work() {
        return "Writing Code...";
    }

//  Constructor
    public Developer(String name, String department) {
        super(name, department);
    }
}

abstract class Notification {

    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();

}
