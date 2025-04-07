package test;

import models.Employee;
import services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee("E001", "John Doe", "IT", "Developer", 60000);
        employeeService.addEmployee(employee);
        assertNotNull(employeeService.searchEmployee("E001"));
    }

    @Test
    public void testRemoveEmployee() {
        Employee employee = new Employee("E002", "Jane Doe", "HR", "Manager", 75000);
        employeeService.addEmployee(employee);
        employeeService.removeEmployee("E002");
        assertNull(employeeService.searchEmployee("E002"));
    }
}
