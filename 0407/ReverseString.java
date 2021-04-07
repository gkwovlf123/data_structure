package dataStructure;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str  = scanner.nextLine();
		
		for(int i = str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
