package projectEuler;
import java.util.Scanner;

public class ComparingFloats {

	public static void main(String[] args) {
		
		System.out.println("Hello, now we're going to compare float numbers! Enjoy");
		Scanner konsola = new Scanner(System.in);
		System.out.print("Input number 1: ");
		float x = konsola.nextFloat();
		System.out.print("Input number 2: ");
		float y = konsola.nextFloat();
		
		if( Math.abs(x - y) < 0.01) {	// tu zmienasz sobie tylko do ktorego miejsca po przecinku porownac
			System.out.println("the same!");
		}
		else {
			System.out.println("Not the same!");
		}
		
		float z = -45.56f;
		float v = Math.abs(z);
		System.out.println(v);
		
			
						
			
		}
	
		
			

	}


