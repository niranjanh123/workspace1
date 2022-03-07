package apas;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n = null;
		String smallest=null;
		n = s.nextLine();
		String[] a = n.split(",");
		int p = a.length;
		System.out.println(p);
		int l=a[0].length();
		smallest = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i].length()<l) {
				l=a[i].length();
				smallest = a[i];
			}
		}
		System.out.println("Smallest string is:"+smallest);
		StringBuilder ans = prefix(smallest,a);
		System.out.println("LongestCommonPrefix is: "+ans);
	}

	private static StringBuilder prefix(String smallest, String[] a) {
		// TODO Auto-generated method stub
		int count = 0;
		int l = smallest.length();
		StringBuilder b = new StringBuilder("");
			for(int j=0;j<l;j++) {
				count=0;
				for(int k=0;k<a.length;k++) { 
				if(smallest.charAt(j)==a[k].charAt(j)) {
					count++;
				}else {
					continue;
				}
			}
				if(count==a.length) {
					b.append(smallest.charAt(j));
				}
		}
	
		return b;
	}
}
