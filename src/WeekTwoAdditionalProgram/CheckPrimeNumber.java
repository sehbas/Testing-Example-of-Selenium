package WeekTwoAdditionalProgram;

public class CheckPrimeNumber {
	static void checkPrimeNumber(int num) {
		int flag = 0;

		if (num == 1) {
			System.out.println("Niether Prime or nor composite");
		} else if (num == 2) {
			System.out.println("Number is Prime ");
		} else if (num % 2 == 0) {
			System.out.println("Not Prime number");
		} else {
			for (int i = 3; i <= num; i = i + 2) {
				if (num % i == 0) {
					System.out.println("Not Prime");
					flag = 1;
					break;
				}
				if (flag == 0) {
					System.out.println("Number is prime");
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrimeNumber(89);
	}

}
