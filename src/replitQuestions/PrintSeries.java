package replitQuestions;

public class PrintSeries {

	public static void main(String[] args) {
		printSeries(4);
		printSeries1(4);
	}

	public static void printSeries(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printSeries1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
