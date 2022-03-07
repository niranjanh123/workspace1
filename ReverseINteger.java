package apas;

import java.util.Scanner;

public class ReverseINteger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,div,sum=0;;
		System.out.println("Enter a number to be revrsed");
		n = s.nextInt();
		while(n>0) {
			div = n%10;
			sum = (sum*10)+div;
			n = n/10;
		}
		System.out.println("The reversed integer value is :"+sum);
	}
}
