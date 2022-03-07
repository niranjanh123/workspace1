package apas;

import java.util.Scanner;

public class Paytm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int m = compute(input);
		System.out.println("Ans"+m);
	}

	private static int compute(String input) {
		// TODO Auto-generated method stub
		int res;
		int j;
		if(input.length()==0)
			return -1;
		else
		{
		res = Character.getNumericValue(input.charAt(0));
				for(int i=0;i<input.length();)
		{
			char ch = input.charAt(i);
			if(ch=='0'||ch=='1')
			{
				i++;
			}
			else
			{
				if(ch=='A')
				{
					j = i;
					int b = Character.getNumericValue(input.charAt(i+1));
					res = res&b;
					i=j+2;
				}
				else if(ch=='B')
				{
					j=i;
					int b = Character.getNumericValue(input.charAt(i+1));
					res = res|b;
					i=j+2;
				}
				else if(ch=='C')
				{
					j=i;
					int b = Character.getNumericValue(input.charAt(i+1));
					res = res^b;
					i=j+2;
				}
				else
				{
					i++;
				}
			}
		}
		}
		return res;
	}

}
