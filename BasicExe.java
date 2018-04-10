package projectEuler;
import java.util.Scanner;

public class BasicExe {
	
	public static void lowerCase() {
		
		Scanner konsola = new Scanner(System.in);
		System.out.print("Insert you wisdom: ");
		String text = konsola.nextLine();
		
		System.out.println(text.toLowerCase());
	}
	
	
	public static int evenOrOdd(int number) {
		
		if (number % 2 == 0) {
			return 1;
		}
		return 0;
		
		}
	
	public static void secondsInto() {
		
		Scanner konsola = new Scanner(System.in);
		System.out.print("Input number of seconds: ");
		
		int secs = konsola.nextInt();
		
		int h = secs / 3600;
		int m = (secs % 3600) / 60;
		int s = secs % 60;
		if (m < 10 && s < 10) {
			System.out.println("time: " + h + ":0" + m + ":0" + s);
			}		
		else if (m < 10 && s > 10) {
			System.out.println("time: " + h + ":0" + m + ":" + s);
			}
		else if (m > 10 && s < 10) {
			System.out.println("time: " + h + ":" + m + ":0" + s);
			}
		else {
			System.out.println("time: " + h + ":" + m + ":" + s);
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		/* 42. Write a Java program to input and display your password. Go to the editor
		Expected Output

		Input your Password:                                                    
		Your password was: abc@123		
		
		System.out.print("Insert your password: ");
		
		Scanner konsola = new Scanner(System.in);
		
		String pass = konsola.next();
		
		System.out.println("Your password is: " + pass);
		
		// index jakiejkolwiek litery ze stringu !
		
		String essej = "Bede Junior Developer !";
		int index = essej.charAt(5);
		System.out.println((char)index);
		
		
		// 49. Write a Java program to accept a number and check the number is even or not. 
		// Prints 1 if the number is even or 0 if the number is odd. Go to the editor
		// Sample Output:
		//	Input a number: 20                                                     
		//	1
		
		
		
		Scanner konsola = new Scanner(System.in);
		System.out.print("Insert your number: ");
		int num = konsola.nextInt();
		
		
		System.out.println("Odd - 0 and Even - 1: " + evenOrOdd(num));
		
		
		
		
		secondsInto();
		 
		
		lowerCase();
		
		
		
		
		String head = "Dzisiaj jest pogoda !";
		String add = "hujowa ";
		
		System.out.println(head.substring(0, 13) + add + head.substring(13));
		
		
		
		
		String text = "Ale mi sie kupe chce, ja jebie zaraz sie zesram !";
		String te = text.substring(0, text.length() / 2);
		
		System.out.println(text);
		System.out.println(te);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
