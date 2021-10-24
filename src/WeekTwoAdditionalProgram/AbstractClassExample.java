package WeekTwoAdditionalProgram;
abstract class ClassA{
	void hello() {
		System.out.println("Hello");
	}
	abstract void bye();
}
class ClassB extends ClassA{

	@Override
	void bye() {
		// TODO Auto-generated method stub
		System.out.println("Bye");
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b= new ClassB();
		b.bye();
			
			
	}

}
