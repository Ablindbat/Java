package JavaAssignment;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double input1= sc.nextDouble();
		//System.out.println();
		System.out.print("Enter Second Number: ");
		double input2= sc.nextDouble();
		//System.out.println();
		System.out.print("Enter Third Number: ");
		double input3 =sc.nextDouble();
		sc.close();
		if(input1==input2 && input2==input3) {
			System.out.print("Numbers are Same.The no is: "+input1);
		}else if(input1 > input2 && input2>input3 && input1 > input3) {
			System.out.print("Greatest Number is: "+input1);
		}else if(input2>input3 && input2>input1) {
			System.out.print("Greatest Number is: "+input2);
		}else {
			System.out.print("Greatest Number is: "+input3);
		}
	}
}
