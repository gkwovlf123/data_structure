package dataStructure;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			num[i] = scan.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.print(num[j]);
		}
	}

}
