package replitQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		// A prime number is a whole number greater then 1 that has only two
		// factors that are 1 and the number itself.

		int number = 13;
		int count = 0;
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
					if (count == 2) {
						System.out.println("since it's divisalbe only by 2 number, it's prime number");
					} else {
						System.out.println("its it not prime number");
					}
				}
			}
		} else {
			System.out.println("since it is less then 1 it's not prime number");
		}
		System.out.println(number);
	}

}
