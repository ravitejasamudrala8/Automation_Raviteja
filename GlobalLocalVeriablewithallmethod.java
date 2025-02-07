package assigment;

public class GlobalLocalVeriablewithallmethod
{
	
	static int a=10;//Global variable
	static int b=5;
	static void add()
	{
		int sum = a+b;//Local Variable
		System.out.println(sum);
	}
	
	static void sub()
	{
		int sub = a-b;
		System.out.println(sub);
	}
	
	static void mul()
	{
		int mul = a*b;
		System.out.println(mul);
	}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
         add();
         sub();
         mul();
	}

}
