// Simple Variable Types Example
public class VariableDemo {

    // 1. CLASS VARIABLE (Static) - shared by all objects
    static String collegeName = "ABC College";

    // 2. INSTANCE VARIABLES - separate for every object
    String studentName;
    int rollNumber;

    // Constructor - to assign value while creating object
    public VariableDemo(String name, int roll) {
        this.studentName = name;
        this.rollNumber = roll;
    }

    // Method to show variables
    public void showDetails() {
        // 3. LOCAL VARIABLE - only used inside this method
        String message = "Student Details:";

        System.out.println(message);
        System.out.println("College: " + collegeName); // Class variable
        System.out.println("Name: " + this.studentName); // Instance variable
        System.out.println("Roll No: " + this.rollNumber); // Instance variable
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Creating 3 student objects
        VariableDemo student1 = new VariableDemo("Amina", 101);
        VariableDemo student2 = new VariableDemo("Moneeba", 102);
        VariableDemo student3 = new VariableDemo("Aleena", 103);

        // Display details
        student1.showDetails();
        student2.showDetails();
        student3.showDetails();

        // Accessing class variable directly
        System.out.println("\nCollege name is: " + VariableDemo.collegeName);
    }
}
