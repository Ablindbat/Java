package JavaAssignment;

import java.util.Scanner;

public class CapitalizeFirstLetter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentance: ");
		String sentance = sc.nextLine();
		sc.close();
		String words[]=sentance.split("\\s");
		String capitalizeStr="";
		for(String word : words) {
			String firstLetter = word.substring(0,1);
			String remainLetter=word.substring(1);
			capitalizeStr += firstLetter.toUpperCase() + remainLetter.toLowerCase() + " ";
		}
	System.out.println(capitalizeStr);			
	}

}
