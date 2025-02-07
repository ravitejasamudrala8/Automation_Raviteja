package assigment;

public class ClassWithNonStaticMethodsUsingDiffrentObject {
	
	
	int a=10;
	int b=20;
	int c=40;
	void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	void sub()
	{
		int sub=c-b;
		System.out.println(sub);
	}
	
	void mul()
	{
		int mul=a*b*c;
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Creating 3 non-static method by accessing them with 3 different object
		ClassWithNonStaticMethodsUsingDiffrentObject s1= new ClassWithNonStaticMethodsUsingDiffrentObject();
		ClassWithNonStaticMethodsUsingDiffrentObject s2= new ClassWithNonStaticMethodsUsingDiffrentObject();
		ClassWithNonStaticMethodsUsingDiffrentObject s3= new ClassWithNonStaticMethodsUsingDiffrentObject();
		
		s1.add();
		s2.sub();
		s3.mul();
		
        
	}

}
