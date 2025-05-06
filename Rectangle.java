public class Rectangle {

    // Member variables
    double width;
    double height;

    // Enum for color with 3 constants
    enum Color {
        RED,
        GREEN,
        BLUE
    }

    // Member variable of enum type
    Color boxColor;

    // Main method
    public static void main(String[] args) {

        System.out.println(Color.BLUE); // Output: BLUE
    }
}
