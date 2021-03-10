package dataStructure;

import java.util.Scanner;

public class FactRecursive {	
	
	public static int factorial(int input) {
		 if(input == 1)
		 return 1;
		 else
		 return input * factorial(input-1);
		}
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		System.out.println(factorial(input));
	}
}
