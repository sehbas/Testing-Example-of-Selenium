package WeekTwoAdditionalProgram;

public class SwapValueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using 3 variables
		int a=10;
		int b=30;
		/*
		 * int temp=a; a=b; b=temp; System.out.println("Value of A is " + a);
		 * System.out.println("Value of b is " + b);
		 */	
	//using 2 variables
	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of A is " + a);
		System.out.println("Value of b is " + b);
	
	}

}
