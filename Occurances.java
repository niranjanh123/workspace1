package apas;

import java.util.Scanner;

public class Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int l,u,x;
		
		l = s.nextInt();
		u = s.nextInt();
		x = s.nextInt();
		int p = COUNTDIGIT(l,u,x);
		
		System.out.println(p);
	}

	private static int COUNTDIGIT(int l, int u, int x) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=l;i<=u;i++)
		{
			int j=i;
			while(j>0)
			{
				int temp = j%10;
				if(temp==x)
				{
					count++;
					j=j/10;
				}
				else
				{
					j=j/10;
				}
			}
						
		}
		return count;
	}
}
