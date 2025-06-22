public class EmployeeManagement {
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("✅ Added: " + emp);
        } else {
            System.out.println("❌ No space to add more employees.");
        }
    }

    
    public Employee searchEmployee(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    
    public void listEmployees() {
        System.out.println("\n📋 All Employees:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    
    public void deleteEmployee(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("🗑️ Deleted Employee with ID: " + id);
                return;
            }
        }
        System.out.println("❌ Employee not found for deletion.");
    }
}
