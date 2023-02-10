package sg.edu.nus.iss;

import java.util.List;

public class EmployeeService {

    private List<Employee> employees;

    public List<Employee> findAllEmployee() {
    }

    public List<Employee> generateEmployees() {
            employees = new Arraylist<Employee>();
          
            Employee emp = new Employee("1234", "Daniel", "SS", "Lect", "daniel@gamil.com", 5000)
            employees.add(emp);

            Employee emp = new Employee("1235", "Eileen", "SS", "Lect", "eileen@gamil.com", 7000)
            employees.add(emp);

            Employee emp = new Employee("1236", "Steven", "SS", "Lect", "steven@gamil.com", 8000)
            employees.add(emp);
        }

}
