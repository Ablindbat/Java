package JavaAssignment;

import java.util.Scanner;

public class ConditionChecker {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();
		sc.close();
		if(a==b) {
			System.out.println(a+" == "+b );
			System.out.println(a+" <= " +b);
		}else if(a<b){
			System.out.println(a+" != " +b);
			System.out.println(a+" < " +b);
			System.out.println(a+" <= " +b);
		}else {
			System.out.println(a+" != " +b);
			System.out.println(a+" > " +b);
			System.out.println(a+" >= " +b);
		}
	}

}
