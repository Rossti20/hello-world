package projectEuler;
import java.util.Scanner;

public class RownanieKwadratowe {

	public static void main(String[] args) {
		
		System.out.println("Hello! Let's solve square equalation! ax2 + bx + c = 0");
		System.out.println("You set parameters a, b, c");
		Scanner konsola = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = konsola.nextInt();
		System.out.print("Input b: ");
		int b = konsola.nextInt();
		System.out.print("Input c: ");
		int c = konsola.nextInt();
		
		double delta = (b*b) - 4*a*c;
		System.out.println("Delta equals: " + delta);
		
		if (delta > 0) {
			double x1 = (-b - (Math.sqrt(delta))) / (2*a);
			double x1r = Math.round(x1);
			double x2 = (-b + (Math.sqrt(delta))) / (2*a);
			double x2r = Math.round(x2);
			System.out.println("The roots are " + x1r + " and " + x2r);			
		}	
		else if (delta == 0) {
			double x3 = (-b)/(2*a);
			System.out.println("The root is " + x3);
		}
		else {
			System.out.println("There are no roots!");
		}
		

			
			
		
		
	}

}
