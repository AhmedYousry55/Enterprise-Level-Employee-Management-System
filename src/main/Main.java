package main;

import models.Employee;
import services.EmployeeService;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();
            if (choice == -1) continue; // Invalid input, re-prompt user
            handleUserChoice(choice);
        }
    }

    private static void displayMenu() {
        System.out.println("Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee Salary");
        System.out.println("5. Exit");
    }

    private static int getUserChoice() {
        int choice = -1;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after nextInt
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
        }
        return choice;
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                removeEmployee();
                break;
            case 3:
                searchEmployee();
                break;
            case 4:
                updateEmployeeSalary();
                break;
            case 5:
                exitProgram();
                break;
            default:
                System.out.println("Invalid Option. Try Again.");
        }
    }

    private static void addEmployee() {
        System.out.println("Enter Employee ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();
        System.out.println("Enter Position: ");
        String position = scanner.nextLine();

        double salary = getValidSalary();
        if (salary == -1) return; // Exit if salary input is invalid

        Employee newEmployee = new Employee(id, name, department, position, salary);
        employeeService.addEmployee(newEmployee);
        System.out.println("Employee Added Successfully");
    }

    private static double getValidSalary() {
        double salary = 0;
        System.out.println("Enter Salary: ");
        try {
            salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        } catch (Exception e) {
            System.out.println("Invalid salary. Please enter a number.");
            scanner.nextLine(); // Consume invalid input
            return -1; // Indicate invalid input
        }
        return salary;
    }

    private static void removeEmployee() {
        System.out.println("Enter Employee ID to Remove: ");
        String removeId = scanner.nextLine();
        employeeService.removeEmployee(removeId);
        System.out.println("Employee Removed Successfully");
    }

    private static void searchEmployee() {
        System.out.println("Enter Employee ID to Search: ");
        String searchId = scanner.nextLine();
        Employee foundEmployee = employeeService.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println("Employee Found: " + foundEmployee.getName());
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    private static void updateEmployeeSalary() {
        System.out.println("Enter Employee ID to Update Salary: ");
        String updateId = scanner.nextLine();

        double newSalary = getValidSalary();
        if (newSalary == -1) return; // Exit if salary input is invalid

        employeeService.updateEmployeeSalary(updateId, newSalary);
        System.out.println("Salary Updated Successfully");
    }

    private static void exitProgram() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
}
