package WeekTwoAdditionalProgram;

public class FibonaciSeries {
	
	static void print(int counter) {
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		counter= counter-2;
		while(counter>1) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			c=0;
			counter--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}

}
