package JavaAssignment;

import java.util.Scanner;

public class ArrayChecker {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbers of Entries: ");
		int n = sc.nextInt();
		if(n>=2) {
		int []array = new int[n];
		System.out.print("Enter array values: ");
		for(int i = 0; i< array.length;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		if(array[0] == 10 || array[array.length-1] == 10) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}
		}else {
			System.out.print("Should be more then 2 or equals to 2.");
		}
			
	}
}
