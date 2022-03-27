package JavaAssignment;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinValue {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number(s) of entry: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the Values: ");
		for(int i = 0; i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		System.out.println("Minimum Value of an array is: "+array[0]);
		System.out.println("Maximum Value of an array is: "+array[array.length-1]);
	}
}
/*
 * Sorting Algorithm*
 * for(int i=0;i<array.length-1;i++){
 * 	for(int j=0 ;j<array.length-i-1;j++){
 * 		if(array[j]>array[j+1]){
 * 			int temp = array[j];
 * 			array[j]=array[j+1];
 * 			array[j+1]=temp;
 * 		}
 * 	}
 * }
 */