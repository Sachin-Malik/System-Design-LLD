package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        EmployeeProxy proxy = new EmployeeProxy();
        proxy.createEmployee("USER", "Sachin", "54,000");
        proxy.createEmployee("ADMIN", "Sachin", "54,000");

    }
}
