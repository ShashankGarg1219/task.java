public class Student {

    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    public static void main(String[] args) {
        // Create an object of Student class
        Student s1 = new Student();

        // Assign values to private variables using the object
        s1.studentName = "Shashank Garg";
        s1.collegeName = "Bhabha University";
        s1.studentID = 101;

        // Print the values
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("College Name: " + s1.collegeName);
        System.out.println("Student ID: " + s1.studentID);

        // Print success message
        System.out.println("Successful");
    }
}
