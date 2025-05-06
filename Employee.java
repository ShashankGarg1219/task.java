public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        // Creating an object of Employee to access non-static members
        Employee emp = new Employee();

        // Attempt to assign 35.5 to age would cause a compile-time error:
        // emp.age = 35.5; // ❌ This line will NOT compile (commented out)

        // ✅ Correct way: Cast double to int
        emp.age = (int) 35.5;

        // Optional: Assign other values to demonstrate usage
        emp.id = 101;
        emp.name = "John Doe";
        emp.isPermanent = true;

        // Print success message
        System.out.println("Successfully started");
    }
}
