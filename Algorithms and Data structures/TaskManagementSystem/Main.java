public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        
        manager.addTask(new Task("T001", "Design UI", "Pending"));
        manager.addTask(new Task("T002", "Write Backend", "In Progress"));
        manager.addTask(new Task("T003", "Testing", "Not Started"));

        
        manager.listTasks();

        
        Task found = manager.searchTask("T002");
        System.out.println("\n🔍 Search Result: " + (found != null ? found : "Not Found"));

        
        manager.deleteTask("T003");

        
        manager.listTasks();
    }
}
