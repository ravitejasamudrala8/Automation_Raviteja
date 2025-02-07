package assigment;

public class LocialOperatorsAND_OR_NOTUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=20;
		int c=30;
		
		if(b>10 && c==b)
		{
			System.out.println("AND");
		}
		
		if(b>10 || c==b) // one condition true will execute
		{
			System.out.println("OR");
		}
		if(!(b>10 || c==b))
		{
			System.out.println("NOT OR");
		}
		
		if(!(b>10 && c==b)) // this is true but opposit pass
		{
			System.out.println("NOT AND");
		}
		
	   }
	}
	
