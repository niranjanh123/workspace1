package apas;

import java.util.ArrayList;
import java.util.Scanner;

public class bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m,n;
		m = s.nextInt();
		n = s.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		h.add(v1);
		v.add(v2);
		long res = prison(m,n,h,v);
		System.out.println(res);
	}

	private static long prison(int m, int n, ArrayList<Integer> h, ArrayList<Integer> v) {
		// TODO Auto-generated method stub
		int v1=0,v2=0;
		int arr1[] = new int[m+2];
		int arr2[] = new int[n+2];
		for(int i=0;i<=m+1;i++)
		{
			if(i==h.get(0))
				arr1[i]=-1;
			else
				arr1[i]=i;
		}
		for(int i=0;i<=n+1;i++)
		{
			if(i==v.get(0))
				arr2[i]=-1;
			else
				arr2[i]=i;
		}
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]==-1)
			{
				v1 = Math.max(v1,arr1[i+1]-arr1[i-1]);
				
			}
		}
		for(int i=0;i<arr2.length-1;i++)
		{
			if(arr2[i]==-1)
			{
				v2 = Math.max(v2,arr2[i+1]-arr2[i-1]);
			}
		}
		
		long res =(long)v1*v2;
		
		return res;
	}

}
