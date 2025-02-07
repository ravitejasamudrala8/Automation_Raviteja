package assigment;

public class ConstructorCalling {
	ConstructorCalling()
			{
				System.out.println("Hi I am Constructor1");
				
			}
			
	ConstructorCalling(String name)
			{
				System.out.println("Hi I am Constructor2");
				
			}
			
	ConstructorCalling(String name,char gender)
			{
				System.out.println(name+  " "  +gender); 
				
				
			}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new ConstructorCalling();
	new ConstructorCalling("Jayashri");
	new ConstructorCalling("Vijay",'M');


	}

}
