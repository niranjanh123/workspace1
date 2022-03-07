package apas;

import java.util.Scanner;

public class StringCut {
	static int d=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int m = compute(input);
		System.out.println(d);

	}

	private static int compute(String input) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<input.length();)
		{
			int j = input.length()-1;
			boolean flag = palindrome_check(input,i,j);
			if(flag)
			{
				i = j+1;
				count++;
			}else
			{
				i++;
			}
		}
		
		return count;
	}

	private static boolean palindrome_check(String input, int i, int j) {
		// TODO Auto-generated method stub
		int temp = j-1;
		StringBuffer b = new StringBuffer();
		StringBuffer c = new StringBuffer();
		if(j==i)
			return false;
		for(int m=i;m<=j;m++)
		{
			b.append(input.charAt(m));
			c.append(input.charAt(m));
		}
		b = b.reverse();
		System.out.println(b+"  "+c);
		if(c==b) {
			d++;
			return true;
		}
		else
			palindrome_check(input,i,temp);
		return false;
	}

}
