package day1;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		char sex = 'F';
		if (age == 18) {
			System.out.println("You can vote");
			if (sex == 'F') {
				System.out.println("Congrate the girl for your first vote !");
			} else {
				System.out.println("Congrate the boy for your first vote !");
			}

		}
		/*
		 * if (age >= 18) {
		 * 
		 * System.out.println("You can vote"); }
		 */ else {
			System.out.println("You can't vote");
		}
	}

}
