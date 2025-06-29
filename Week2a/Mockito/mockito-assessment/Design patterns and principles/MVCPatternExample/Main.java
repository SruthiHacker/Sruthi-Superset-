public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("John Doe", "STU123", "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();

        System.out.println("\n🛠️ Updating student grade...\n");

        
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
