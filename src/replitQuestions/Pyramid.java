package replitQuestions;

public class Pyramid {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" "); //this line add space from left side
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
			System.out.println(" "); //this line just move to the next line
		}
	}

}
