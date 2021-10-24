package WeekTwoAdditionalProgram;
interface intAA{
	void hello(int num);
	
}
interface intBB{
	void bye();

}
class intC implements intAA,intBB{
	public void hello(int num) {
		System.out.println("Hello   " + num);
	}
	public void bye() {
		System.out.println("Bye");
	}
}

public class MultipleInheritanceWithMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intC c= new intC();
				c.hello(10);
	}

}
