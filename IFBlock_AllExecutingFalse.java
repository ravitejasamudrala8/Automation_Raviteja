package assigment;

public class IFBlock_AllExecutingFalse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    	int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // First if block: check if a is greater than b (false)
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Second if block: check if c is equal to d (false)
        if (c == d) {
            System.out.println("c is equal to d");
        } else {
            System.out.println("c is not equal to d");
        }

        // Third if block: check if e is less than a (false)
        if (e < a) {
            System.out.println("e is less than a");
        } else {
            System.out.println("e is not less than a");
        }

        // Fourth if block: check if b is greater than or equal to 100 (false)
        if (b >= 100) {
            System.out.println("b is greater than or equal to 100");
        } else {
            System.out.println("b is not greater than or equal to 100");
        }
    }    
}
