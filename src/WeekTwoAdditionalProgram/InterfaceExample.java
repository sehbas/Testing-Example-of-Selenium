package WeekTwoAdditionalProgram;

interface intA {
	void hello();

	void bye();
}

class intB implements intA {

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello ");
	}

	
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("Bye ");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intB ms = new intB();
		ms.hello(); ms.bye();
		
	}

}
