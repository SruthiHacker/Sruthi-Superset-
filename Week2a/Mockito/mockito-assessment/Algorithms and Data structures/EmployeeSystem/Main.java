public class Main {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement(5);

        
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 50000));
        ems.addEmployee(new Employee("E002", "Bob", "Engineer", 40000));
        ems.addEmployee(new Employee("E003", "Charlie", "Analyst", 35000));

        
        ems.listEmployees();

        
        Employee found = ems.searchEmployee("E002");
        System.out.println("\n🔍 Search Result: " + (found != null ? found : "Not Found"));

        
        ems.deleteEmployee("E003");

        
        ems.listEmployees();
    }
}
