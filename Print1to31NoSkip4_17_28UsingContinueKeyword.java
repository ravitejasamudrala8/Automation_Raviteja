package assigment;

public class Print1to31NoSkip4_17_28UsingContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 31; i++) {
   
            if (i == 4 || i == 17 || i == 28) {
                continue; // Skip the current iteration
            }
           
            System.out.println(i);
        }
    }

	}


