package replitQuestions;

public class Print3DigitsOfCombinationOfNumbers {

	public static void main(String[] args) {

		int number[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			for (int j = 1; j < number.length; j++) {
				System.out.println(number[j]);
				for (int k = 1; k < number.length; k++) {
					System.out.println(number[k]);

				}

			}
		}
	}

}
