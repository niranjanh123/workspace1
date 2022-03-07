package apas;

import java.util.Scanner;

public class Number_counter {
	
	public static void main(String [] args)
	{
		Scanner s =  new Scanner(System.in);
		int k,n;
		k = s.nextInt();
		n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int res = result(k,a);
		System.out.print("Max is:"+res);
	}

	private static int result(int k, int[] a) {
		// TODO Auto-generated method stub
		int max=0,count;
		String m = String.valueOf(k);
		char v = m.charAt(0);
		for(int i=0;i<a.length;i++)
		{
			int v1 = a[i];
			count=0;
			String v2 = String.valueOf(v1);
			for(int j=0;j<v2.length();j++)
			{
				if(v2.charAt(j)==v)
				{
					count++;
				}
				max = Math.max(max, count);
			}
			
		}
		return max;
	}
}
