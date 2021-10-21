package day1;

public class methodexample {
	static void check_age(int age,char gender) {
		if(age==18) {
			System.out.println("You can vote !");
			if(gender=='F') {
				System.out.println("Congratulation girl for your first vote !");
			}else {
				System.out.println("Congratulation boy for your first vote !");
			}
		}
	}
	static int sum(int a,int b) {
		int c= a+b;
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			check_age(18, 'M');
			int result=sum(15,25);
			System.out.println("Sum of two number  "+result);
	}

}
