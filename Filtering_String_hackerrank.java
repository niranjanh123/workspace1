package apas;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;
public class Filtering_String_hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String data;
		data = s.nextLine();
		divide(data);
		
	}

	private static void divide(String data) {
		// TODO Auto-generated method stub
		String name="";
		String price = "";
		String quantity = "";
	    String[] n = data.split("\\W+");
		int l = n.length;
		System.out.println(l);
		for(int i =0;i<l;i++) {
			if(i==0) {
				name = n[0];
			}else if(i==1) {
				price = n[1];
			}else if(i==2) {
				quantity = n[2];
			}
		}
		double d = Double.parseDouble(price);
		int k = Integer.parseInt(quantity);
		System.out.println("Name is:"+name);
		System.out.println("Price is:"+d);
		System.out.println("Quantity is:"+k);
	}

}
