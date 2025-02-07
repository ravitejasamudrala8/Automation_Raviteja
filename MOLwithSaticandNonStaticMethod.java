package assigment;

public class MOLwithSaticandNonStaticMethod {

	// Static method with one integer parameter
    static void display(int number) {
        System.out.println("Static method called with int: " + number);
    }

    // Non-static method with one string parameter
    void display(String message) {
        System.out.println("Non-static method called with String: " + message);
    }

    // Static method with two integer parameters
    static void display(int number1, int number2) {
        System.out.println("Static method called with two ints: " + number1 + " and " + number2);
    }

    // Non-static method with one double parameter
    void display(double value) {
        System.out.println("Non-static method called with double: " + value);
    }

    public static void main(String[] args) {
        // Call static methods directly using the class name
    	MOLwithSaticandNonStaticMethod.display(42);                // Calls static method with one int
    	MOLwithSaticandNonStaticMethod.display(10, 20);           // Calls static method with two ints

        // Create an object to call non-static methods
    	MOLwithSaticandNonStaticMethod example = new MOLwithSaticandNonStaticMethod();
        example.display("Hello, Java!");              // Calls non-static method with one string
        example.display(3.14);                        // Calls non-static method with one double
    }

}
