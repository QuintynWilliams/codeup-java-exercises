public class Abstract_InterfacesLesson {

    public static void main(String[] args) {
//      'Employee' is abstract; cannot be instantiated
//      Employee newGuys = new Employee("Bob", "Receiving");
        Developer newGuy = new Developer("Frank", "Front-end");
        System.out.println(newGuy.work());

        Bear bigBear = new Bear("Yogi", "Grizzly", 600.00, true);
        System.out.println(bigBear.skin());

        String[] weddingItems = {"Baby Carriage", "Toaster", "Fondue Kit", "Single China Set"};
        WishList newWishList = new WishList("Wedding Registry", weddingItems);
        String newShareLink = newWishList.shareLink();
        System.out.println(newWishList.getName() + " => " + newShareLink);

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


abstract class Animal {
    //  Fields
    protected String name;
    protected String species;
    protected Double weight;
    protected boolean islegendary;
//  GET/SET
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public boolean isIslegendary() {
        return islegendary;
    }
    public void setIslegendary(boolean islegendary) {
        this.islegendary = islegendary;
    }
//  Constructor
    public Animal() {}
    public Animal(String name, String species, Double weight, boolean islegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.islegendary = islegendary;
    }

}

// Applies Skinnable method(s) to the SUBc Bear
// Animal !| Bear has access to these methods w/o implementation
// Protects the classes from running methods the user/program intends to
class Bear extends Animal implements Skinnable {

//  Methods
    @Override
    public String skin() {
        if (this.islegendary) {
            return "Legendary Bear Hide";
        }
        return "Bear Hide";
    }

//  Constructor
    public Bear(String name, String species, Double weight, boolean islegendary) {
        super(name, species, weight, islegendary);
    }

}


abstract class List {

    protected String name;

    protected String[] items;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String[] getItems() {
        return items;
    }
    public void setItems(String[] items) {
        this.items = items;
    }

    public List() {}
    public List(String name, String[] items) {
        this.name = name;
        this.items = items;
    }
}

class WishList extends List implements Shareable, Deletable {

    public WishList(String name, String[] items) {
        super(name, items);
    }

    @Override
    public String shareLink() {
        return "https://mysharelink.com";
    }

    @Override
    public String delete() {
        return this.name + " deleted";
    }
}

class PrivateList extends List {
    public PrivateList(String name, String[] items) {
        super(name, items);
    }
}

