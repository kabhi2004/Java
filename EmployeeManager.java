package Gitcode;
import java.util.*;

class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeManager {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Employee Manager ");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Remove Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: displayEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: removeEmployee(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee temp = new Employee("", id, "");
        if (employeeList.contains(temp)) {
            System.out.println("Employee with this ID already exists.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        employeeList.add(new Employee(name, id, department));
        System.out.println("Employee added successfully.");
    }

    private static void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("Sort by:\n1. Name\n2. ID");
        int sortChoice = scanner.nextInt();
        scanner.nextLine();

        if (sortChoice == 1) {
            employeeList.sort(Comparator.comparing(Employee::getName));
        } else if (sortChoice == 2) {
            employeeList.sort(Comparator.comparingInt(Employee::getId));
        } else {
            System.out.println("Invalid sort option. Displaying unsorted list.");
        }

        System.out.println("\n--- Employee List ---");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    private static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("We Removed employee.");
                return;
            }
        }
        System.out.println("Employee is not there");
    }
}
