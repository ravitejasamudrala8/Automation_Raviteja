package assigment;

import java.util.Scanner;

public class ScannerClassAllMethodatRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Creating a Scanner object to read input from the user
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Enter your name");
		        String name=s1.next();
		        System.out.println("Enter your age");
		        int a= s1.nextInt();
		        System.out.println("Enter your b");
		        byte b= s1.nextByte();
		        System.out.println("Enter your c");
		        short c = s1.nextShort();
		        System.out.println("Enter your d");
		        float d= s1.nextFloat();
		        System.out.println("Enter your e");
		        double e = s1.nextDouble();
		        System.out.println("Enter your f");
		        boolean f = s1.nextBoolean();
		        long g = s1.nextLong();
		                 s1.close();

	}

}
