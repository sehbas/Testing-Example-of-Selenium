package WeekTwoAdditionalProgram;

public class ExceptionalHandalingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
			System.out.println("Hello");
		}catch (Exception ex) {
			System.out.println(ex);
			System.out.println("Bye");
		}
	}

}
