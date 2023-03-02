package replitQuestions;

public class InnerLoop {

	public static void main(String[] args) throws InterruptedException {
//		String symbole="$";
 		for (int i=1; i<=4; i++) {  
			System.out.println();// this line movies to the next line in console
			for (int j=1;j<=i; j++) {
				System.out.print(j);
				Thread.sleep(500);
			}
		}

	}
	

}
