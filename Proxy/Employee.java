package Proxy;

public class Employee implements IEmployee {
    String salary;
    String name;
    String Id;

    Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    public void updateDetails(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }
}
