package WeekTwoAdditionalProgram;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		
		int arr[]= {10,20,30};
		arr[10]=100;
	//	int a=10/0;
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e);
		System.out.println("Bye 1");
	}
	catch (Exception ex) {
		// TODO: handle exception
		System.out.println(ex);
		System.out.println("Bye 2");
	}
	
	}

}
