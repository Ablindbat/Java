package JavaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNthElement {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		System.out.print("Enter number of entries: ");
		int n = sc.nextInt();
		System.out.println("Enter the Values: ");
		for(int i = 0 ; i < n ; i++) {
			input.add(sc.nextInt());
		}
		System.out.println("Enter the position which one you Want to remove: ");
		int p = sc.nextInt();
		sc.close();
		input.remove(p-1);
		System.out.println("The Final List is : "+input.toString());
	}

}
