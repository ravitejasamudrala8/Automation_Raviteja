package assigment;

public class StaticMethodsWithNonSaticMethod {

	
		public static void staticMethod1()
		{
			System.out.println("Executing static Method 1");
		}
		public static void staticMethod2()
		{
			System.out.println("Executing static Method 2");
		
		}
		public static void staticMethod3()
		{
			System.out.println("Executing static Method 3");
		}
		
		public void NonstaticMethod1()
		{
			System.out.println("Executing Non-static Method 1");
		}
		public void NonstaticMethod2()
		{
			System.out.println("Executing Non-static Method 2");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Static Method
			StaticMethodsWithNonSaticMethod.staticMethod1();
			StaticMethodsWithNonSaticMethod.staticMethod2();
			StaticMethodsWithNonSaticMethod.staticMethod3();
			//Non Static Method
			StaticMethodsWithNonSaticMethod m1=new StaticMethodsWithNonSaticMethod();//Creating Object
			m1.NonstaticMethod1();
			m1.NonstaticMethod2();
			
			
			
			
			
		}
		

	
{
}
{
}
}
