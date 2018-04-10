package projectEuler;
import java.util.Scanner;

public class NajwiekszaLiczba {

	public static void main(String[] args) {
		System.out.println("Find the greatest number!");
		
		Scanner konsola = new Scanner(System.in);
		System.out.print("Input the 1st number: ");
		int first = konsola.nextInt();
		System.out.print("Input the 2nd number: ");
		int second = konsola.nextInt();
		System.out.print("Input the 3rd number: ");
		int third = konsola.nextInt();
		
		if (first > second && first > third) {
			System.out.println("The greatest is 1st: " + first);
		}
		else if (second > first && second > third) {
			System.out.println("The greatest is 2nd: " + second);
		}
		else {
			System.out.println("The greatest is 3rd: " + third);
		}
			
		
		
		
		

	}

}
