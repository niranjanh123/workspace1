package apas;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String n;
		int res = 0;
		System.out.println("Enter the string to be converted to integer");
		n = s.nextLine();
		try {
			if(!(n.contains("[0-9]"))){
				System.out.println("Enter numbers in the string");
			}else {
		res = Integer.parseInt(n);
		System.out.println("The result is :"+res);
			}
	}catch(Exception e) {
		e.printStackTrace();
	}
		
  }
}
