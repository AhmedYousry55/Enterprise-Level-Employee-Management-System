package services;

import models.Employee;
import java.util.HashMap;

public class EmployeeService {
    private HashMap<String, Employee> employees = new HashMap<>();

    // Add new employee
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    // Remove employee by ID
    public void removeEmployee(String employeeId) {
        employees.remove(employeeId);
    }

    // Search for employee by ID
    public Employee searchEmployee(String employeeId) {
        return employees.get(employeeId);
    }

    // Update employee details
    public void updateEmployeeSalary(String employeeId, double newSalary) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            employee.setSalary(newSalary);
        }
    }
}
