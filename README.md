# Enterprise-Level Employee Management System

## Overview
This project is a command-line-based Employee Management System built using native Java data structures and algorithms. It is designed to handle core human resource functions, including employee record management, payroll processing, attendance tracking, and performance evaluation. The system is scalable, efficient, and built entirely using Java’s native data structures such as `HashMap`, `ArrayList`, `HashSet`, and `TreeMap`.

---

## Features

### Employee Management
- Add new employees with details like ID, name, department, position, and salary.
- Remove employees by ID.
- Search employees by ID.
- Update employee salary.

### Payroll System
- Manage employee payroll details.
- Calculate salary with bonuses and deductions (this can be extended in the future).

### Attendance Tracking
- Track employee clock-in and clock-out times.
- Mark absences and leaves.

### Performance Evaluation
- Track employee performance on a quarterly or annual basis.
- Assign scores based on performance evaluations.

### Data Storage
- All employee-related data is stored using Java’s native data structures (e.g., `HashMap` for employee records, `ArrayList` for attendance logs, etc.).

### Command-Line Interface (CLI)
- A user-friendly CLI allows interaction with the system, providing options to manage employees, payroll, attendance, and performance evaluations.

---

## Technologies Used
- **Java**: The core programming language for developing the system.
- **JUnit**: For unit testing.
- **Java Data Structures**: `HashMap`, `ArrayList`, `HashSet`, `TreeMap`.

---

## Project Structure

```
EmployeeManagementSystem/
├── src/
│   ├── models/
│   │   ├── Employee.java
│   │   ├── Payroll.java
│   │   ├── Attendance.java
│   │   └── Performance.java
│   ├── services/
│   │   ├── EmployeeService.java
│   │   ├── PayrollService.java
│   │   ├── AttendanceService.java
│   │   └── PerformanceService.java
│   ├── main/
│   │   └── EmployeeManagementApp.java
│   └── utils/
│       └── UtilityClass.java
├── test/
│   └── EmployeeServiceTest.java
├── .gitignore
└── README.md
```

### `src/models/`
- `Employee.java`: Employee information such as ID, name, position, etc.
- `Payroll.java`: Salary details, bonuses, and deductions.
- `Attendance.java`: Clock-in and clock-out tracking.
- `Performance.java`: Performance evaluation data.

### `src/services/`
- `EmployeeService.java`: Add, remove, search employees.
- `PayrollService.java`: Salary calculations.
- `AttendanceService.java`: Track attendance.
- `PerformanceService.java`: Manage performance scores.

### `src/main/`
- `EmployeeManagementApp.java`: CLI-based interface entry point.

### `test/`
- `EmployeeServiceTest.java`: Test functionality of employee operations.

---

## Getting Started

### Prerequisites
- Java 11 or higher
- JUnit (typically bundled in your IDE or configured via Maven/Gradle)

---

### Setup Instructions

#### Clone the Repository

```bash
git clone https://github.com/your-username/EmployeeManagementSystem.git
cd EmployeeManagementSystem
```

#### Compile the Project (Command Line)

```bash
javac -d bin src/main/EmployeeManagementApp.java src/models/*.java src/services/*.java
```

#### Run the Application

```bash
java -cp bin main.EmployeeManagementApp
```

---

## Example Commands in the CLI

```
Employee Management System
1. Add Employee
2. Remove Employee
3. Search Employee
4. Update Employee Salary
5. Exit
```

### Example Usage

- **Add an Employee**  
  Enter `1` and provide the ID, name, department, position, and salary.

- **Remove an Employee**  
  Enter `2` and provide the employee ID.

- **Search for an Employee**  
  Enter `3` and provide the employee ID.

- **Update Employee Salary**  
  Enter `4` and provide the employee ID and new salary.

- **Exit**  
  Enter `5`.

---

## Running Unit Tests

### Using an IDE
Right-click on the test class → Run or Run with Coverage

### Using Command Line (if using Maven or Gradle):

```bash
mvn test
```

or

```bash
gradle test
```

---

## Testing the Application

Make sure all functions such as adding, removing, updating employees work correctly. Test with edge cases like duplicate IDs, invalid input, and large data sets.

---

## Contributing

Contributions are welcome! Fork the repo, make your changes, and submit a pull request. Make sure to write tests for any new features.


