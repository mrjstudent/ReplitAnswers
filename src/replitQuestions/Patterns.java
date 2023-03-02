package replitQuestions;

public class Patterns {
	public static void main(String[] args) {
		printPattern1(3);
		System.out.println("------");
		printPattern2(4);
		System.out.println("------");
		printPattern3(3);
	}
	public static void printPattern1(int n) {
		for(int i=1;i <=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void printPattern2(int n) {
		for(int i=1;i <=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void printPattern3(int n) {
		for(int i=1;i <=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	

}
