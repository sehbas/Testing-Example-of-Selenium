package WeekOne;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = sc.nextInt();
		System.out.println("Enter the Gender");
		gender = sc.next().charAt(0);
		if (age <= 0) {
			System.out.println("Please Enter valid input data");
		} else if (age >= 1 || age <= 17) {
			if (gender == 'F') {
				System.out.println("you are too young to vote girl !");
			} else {
				System.out.println("you are too young to vote boy !");
			}
		} else if (age == 18) {
			System.out.println(" congrats you are now eligible to vote");
		} else if (age >= 19 || age <= 60) {
			System.out.println("you should use your right to vote");
		} else if (age > 60) {
			System.out.println("you can vote from home as well ");
		}
		else {
			System.out.println("Please Enter valid input data");
		}
	}

}
