package projectEuler;

import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.lang.Object;

public class ArraysExe {
	
	
	public static boolean arraySumOfTens(int[] tabela, int liczba, int suma) {
		
		int sumOfTens = 0;
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] == liczba) {
				sumOfTens += tabela[i];				
			}			
		}
		if (sumOfTens == suma) {
			return true;
		}
		return false;
		
	}
	
	public static boolean test(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0 || numbers[i] == -1) {
				return true;
			}						
		}	
		return false;
	}	
	
	
	public static int insertElement(int[] tablica, int index, int value) {	
		
		// nie dziala do konca
		
		for (int i = index; i < tablica.length -1; i++) {
			tablica[i] = tablica[i + 1];
			tablica[index] = value;	
		}	
		return 1;		
	}	
	
	
	
	public static boolean contains(int[] array, int item) {
		for (int x : array) {
			if (x == item) {
				return true;
			}			
		}		
		return false;		
	}
	
	public static int findIndex(int[] arr, int ite) {
		if (arr.length == 0) 
			return -1;
		
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == ite) {
				return i;
			}
			else {
				i++;
			}				
		}		 
			return -1;
		}
	
		
	
	

	public static void main(String[] args) {
		
		// SORTING !
		
		/* 
		 
		
		int[] numbers = {
				23, 45, 56, 43, 91, 23, 56,
				34, 911, 782, 76, 56
		};
		
		String[] texts = {
				"kiedys",
				
				"bede",
				"jasny",
				"zwala",
				"normalniejszy"
		};
		
		
		System.out.println("None sorted: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Sorted: " + Arrays.toString(numbers));
		
		System.out.println("none sorted: " + Arrays.toString(texts));
		Arrays.sort(texts);
		System.out.println("sorted: " + Arrays.toString(texts));
		
		*-------------------------------------------------------------------------
		
		
		///// SUMOWANIE !
		
		
		int[] sumki = {
				23, 456, 567,
				12, 499, 311,
				45, 845, 234
		};
		int sum = 0; //  petla FOR
		for (int i = 0; i < sumki.length; i++) {
			sum += sumki[i];
			System.out.println(sum);
		}
		
		int sumera = 0; // petla FOR ENHANCED ULEPSZONA
		for ( int x : sumki) 
			sumera += x;
			System.out.println(sumera);
		
		
		
		String[][] grid = {
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"},
				{"-" , "-", "-", "-", "-", "-" , "-", "-", "-", "-"}
		};
		
		for (int i=0; i < grid.length[i]; i++) {
			for (int j=0; j < grid.length[i][j]; j++) {
				System.out.println(grid[i][j]);
			};
			
		};
		
		
		int [][]a = new int[10][10];    
		 for(int i = 0; i < 10; i++)
		   {
		      for(int j = 0; j < 10; j++)
		      {
		         System.out.printf("%2d ", a[i][j]);
		      }
		      System.out.println();
		   }
		   -------------------------------------------------------------------------------
		
		
		
		// Average value of array
		
		int[] numbers = {
				23, 45, 56, 43, 91, 23, 56,
				34, 911, 782, 76, 56
		};
		
		int sum = 0;
		for ( int x : numbers) {
			sum += x;			
		}
		int avg = sum / numbers.length;
		System.out.println(avg);
		----------------------------------------------------------------------

		
		
		// Contains czy zawiera, utworzona metoda contains - zawiera dwa parametry, tablice i liczbe.
		
		
		int[] numbers = {
				23, 45, 56, 43, 91, 23, 56,
				34, 911, 782, 76, 56
		};
		
		
		boolean czyZawiera = contains(numbers, 23);
		System.out.println(czyZawiera);
		System.out.println(contains(numbers, 782));
		
		-------------------------------------------------------------------------
		
		
		
		// Write a Java program to find the index of an array element.
		
		int[] tabliczka = {3, 6, 18, 29, 41};
		
		int index = findIndex(tabliczka, -67);
		System.out.println(index);
		
		------------------------------------------------------------------
		
	
		
		
		// 7. Write a Java program to remove a specific element from an array.
		
		
		
		int[] myTab = {23, 45, 58, 2, 78};
		
		System.out.println("Orginal tab: " + Arrays.toString(myTab));
		
		
		
		// Write a Java program to insert an element (specific position) into an array
		
		
		
		int[] myTab = {23, 45, 58, 2, 78, 66, 78, 4};
		
		
		insertElement(myTab, 0, 999);
		
		
		System.out.println(Arrays.toString(myTab));
		
		
		
		// 10. Write a Java program to find the maximum and minimum value of an array.
		
		int[] myTab = {23, 45, 58, 2, 555, 78, 66, 78, 4, -44};
		
		Arrays.sort(myTab);
		int min = myTab[0];
		int max = myTab[myTab.length -1];
		
		System.out.println("Minimum: " + min + " , Maximum: " + max);
		
		
		// Write a Java program to reverse an array of integer values.
		
		// 1st solution with new tab !
		
		int[] myTab = {23, 45, 58, 2, 555, 99, 66, 78, 4, 567, 921, -44};
		
		System.out.println(Arrays.toString(myTab));
		
		int[] newTab = new int[myTab.length];
		
		for (int i = 0; i < myTab.length; i++) {
			
			if (i < (myTab.length / 2)) {
				newTab[i] = myTab[myTab.length - (i + 1)];
			}
						
			if (i >= (myTab.length / 2)) {
				newTab[i] = myTab[myTab.length - (i + 1)];
			}			
					
		}
		
		System.out.println(Arrays.toString(newTab));
		
		// 2nd solution the same tab with temp int !
		 * 
		
		
		int[] myTab = {23, 45, 58, 2, 555, 99, 66, 78, 4, 567, 921, -44};
		
		
		System.out.println(Arrays.toString(myTab));
		
		for (int i = 0; i < myTab.length / 2; i++) {
			
			int temp = myTab[i];
			
			myTab[i] = myTab[myTab.length - i - 1 ];
			myTab[myTab.length - i - 1] = temp;
		}
		
		System.out.println(Arrays.toString(myTab));
		
		
		
		int[] myArr = {2, 3, 5, 7, 8, 9, 5, 2};
		
		for (int i = 0; i < myArr.length; i++) {
			for (int j = i + 1; j < myArr.length; j++) {
				
				if ((myArr[i] == myArr[j]) && (i != j))
						{
					
					System.out.println("Duplicate: " + myArr[i]);					
				}
			}		
		}
		
		
		// wyrzucanie zer i przesuniecie reszty !
		
		
		int[] tablica = {0, 2, 4, 5, 6, 9, 12};
		
		
		for (int i = 0; i < tablica.length - 1; i++) {
			
			if (tablica[i] == 0) {
				for (int j = i + 1; j < tablica.length - 1; j++) {
					
					tablica[j + 1] = tablica[j];
				}
				
				
				// nie dopracowane !
			}
		}
		System.out.println(Arrays.toString(tablica));
		
		
		// 30. Write a Java program to check if an array of integers without 0 and -1.
		
		int[] myArria = new int[] {3, 61, 43, 71, 23};
		
		
		
		System.out.println("Array contains 0 or -1? " + test(myArria));
		
				
		
		
		// 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. 
		// Return false if the condition does not satisfy, otherwise true.
		
		int[] tabela = { 23, 10, 1, 10, 1, 1, 1, 1, 10, 3};
		
		System.out.println("t/f, tens sum is 30 ? " + arraySumOfTens(tabela, 10, 30));
		
		*/
		
		
		
		
		
	}

}
 