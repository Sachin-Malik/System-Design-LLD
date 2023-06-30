package Proxy;

import javax.imageio.IIOException;

public class EmployeeProxy implements IEmployeeProxy {

    Employee employee;

    public void createEmployee(String client, String name, String salary) {

        try {
            if (client.equals("ADMIN")) {
                this.employee = new Employee(name, salary);
                System.out.println("Employee Created");
            } else {
                throw new IIOException("Does Not have privlage for This Activity");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void getDetails(String clientRole) {
        if (clientRole.equals("Admin")) {
            employee.getDetails();
        }
    }

    public void updateDetails(String name, String salary) {

    }
}
