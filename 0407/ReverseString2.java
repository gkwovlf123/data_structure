package dataStructure;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		System.out.println(sb.reverse());
	}

}
