package demo;
import java.util.Scanner;
public class xpencils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter In Number, how much you want to denote: ");
		
		int a = scanner.nextInt();
		
		int pencilToClass = a/9;
		
		int pencilToLibrary = a % 9;
		
		String s = "Total pencil distributed to Each Class is: " +Integer.toString(pencilToClass);
		String s1 = "Remaining pencil distributed to Library: "  +Integer.toString(pencilToLibrary);
		System.out.println(s);
		System.out.println(s1);
	}	

}
