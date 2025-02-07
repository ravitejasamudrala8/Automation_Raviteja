package assigment;

public class MethodConstructorOverloading {
 
	    // Method overloading examples

	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Overloaded method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Overloaded method to add two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }
	 // Constructor overloading examples

	    private String name;
	    private int age;

	    // Default constructor
	    public MethodConstructorOverloading() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    // Constructor with one parameter
	    public MethodConstructorOverloading(String name) {
	        this.name = name;
	        this.age = 0;
	    }

	    // Constructor with two parameters
	    public MethodConstructorOverloading(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    // Display method
	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	    {
	        // Testing method overloading
	        MethodConstructorOverloading example = new MethodConstructorOverloading();
	        System.out.println("Method Overloading:");
	        System.out.println("Add two integers: " + example.add(10, 20));
	        System.out.println("Add three integers: " + example.add(10, 20, 30));
	        System.out.println("Add two doubles: " + example.add(10.5, 20.5));

	        // Testing constructor overloading
	        System.out.println("\nConstructor Overloading:");
	        MethodConstructorOverloading obj1 = new MethodConstructorOverloading();
	        obj1.display();

	        MethodConstructorOverloading obj2 = new MethodConstructorOverloading("Alice");
	        obj2.display();

	        MethodConstructorOverloading obj3 = new MethodConstructorOverloading("Bob", 25);
	        obj3.display();
	    }
	}

	

}
