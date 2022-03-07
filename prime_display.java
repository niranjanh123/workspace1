package apas;

import java.util.Scanner;

public class prime_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		if(range<=2)
			System.out.println("Invlaid input");
		for(int i=2;i<range;i++)
		{
			boolean flag = compute(i);
			if(flag)
				System.out.print(i+" ");
		}

	}

	private static boolean compute(int i) {
		// TODO Auto-generated method stub
		int c=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				c++;
			}
		}
		if(c==2)
			return true;
		else
			return false;
	}

}
