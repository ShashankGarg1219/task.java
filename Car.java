import java.util.Scanner;

public class Car {

    // Attributes of the Car class
    String make;
    String model;
    short year;
    int price;

    // Constructor to initialize all attributes
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Make  : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);
        System.out.println("Car Price : ₹" + price);
        System.out.println("----------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of cars
        System.out.print("How many cars do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        // Array to store car objects
        Car[] cars = new Car[count];

        // Input and object creation
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Car #" + (i + 1));
            System.out.print("Enter Make: ");
            String make = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Year: ");
            short year = sc.nextShort();

            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume newline

            // Create and store Car object
            cars[i] = new Car(make, model, year, price);
        }

        // Displaying all car details
        System.out.println("\n--- Car Details ---");
        for (Car car : cars) {
            car.displayCarInfo();
        }

        sc.close();
    }
}
