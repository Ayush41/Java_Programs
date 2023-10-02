// Define a class named Demo
class Demo {
    int a = 7;
    String b = "Ronaldo";

    // Define a method named Show
    void Show() {
        // Display the values of 'a' and 'b' with a space in between
        System.out.println(a + " " + b);
    }
}

// Define a public class named ClassObj (the main class)
public class ClassObj {
    // Define the main method, the entry point of the program
    public static void main(String[] args) {
        // Display "Working..." to indicate that the program is running
        System.out.println("Working...");

        // Create an object 'r' of the Demo class
        Demo r = new Demo();

        // Call the Show method on the 'r' object to display the values of 'a' and 'b'
        r.Show();
    }
}
