package JavaAssignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter A string: ");
	String input = sc.nextLine();
	sc.close();
	char []arr = input.toCharArray();
	for(int i=arr.length-1;i >= 0 ; i--)
	System.out.print(arr[i]);
	}
}
/*
 *string input = sc.nextLine();
 *input.reverse();
 */
