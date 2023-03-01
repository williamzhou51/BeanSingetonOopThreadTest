package java8;

public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        super();
        this.name = name;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}
