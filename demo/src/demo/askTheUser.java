package demo;
import java.util.Scanner;
public class askTheUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to make the pattern with the given number: ");
		int total = scanner.nextInt();
		
		int totalSquare = patternMakingMethod(total);
		
		System.out.println(totalSquare);
		
		scanner.close();
		
	}
		public static int patternMakingMethod(int total) {
			return (total * (total + 1)) / 2 + 2;
	}

}
