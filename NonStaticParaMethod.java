package assigment;

import javabasics.NonStatic_Method;

public class NonStaticParaMethod {
	
	public void displaySquare(int number) {
        System.out.println("The square of " + number + " is " + (number * number));
    }

    public static void main(String[] args) {
        // Create an instance of the class
    	NonStaticParaMethod example = new NonStaticParaMethod();

        // Call the non-static parameterized method with an int argument
        example.displaySquare(5);
        example.displaySquare(10);
    }
			
		}



