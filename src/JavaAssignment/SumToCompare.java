package JavaAssignment;

import java.util.Scanner;

public class SumToCompare {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c = sc.nextInt();
		sc.close();
		System.out.println("The result is: "+sumoftwo(a,b,c));
		}
	public static boolean sumoftwo(int x, int y, int z ) {
		return (x+y==z || x+z == y ||y+z==x);
		}
}
