package apas;

import java.util.HashSet;
import java.util.Scanner;

public class NonRepitive_Reptitve_Sequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data="";
		HashSet<Character> set = new HashSet<Character>();
		data = s.nextLine();
		StringBuilder b= new StringBuilder();
		int l = data.length();
		for(int i=0;i<l;i++) {
			if(!(set.contains(data.charAt(i)))) {
				set.add(data.charAt(i));
				b.append(data.charAt(i));
			}else {
				continue;
			}
		}
		System.out.println("Builder :"+b);
		sequence(b,data);
	}

	private static void sequence(StringBuilder b, String data) {
	int l = b.length();
	int len = data.length();
	StringBuilder m  = new StringBuilder();
	int count;
	for(int i=0;i<l;i++) {
		count=0;
		for(int j=0;j<len;j++) {
			if(b.charAt(i)==data.charAt(j)&&count==0) {
				count++;
			}
			else if(b.charAt(i)==data.charAt(j)&&count!=0) {
				m.append(data.charAt(j));
			}
			else {
				continue;
			}
		}
	  }
	System.out.println("repeat: "+m);
	StringBuilder r = new StringBuilder();
	r.append(b);
	r.append(m);
	System.out.println(r);
	}
}
