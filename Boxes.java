package apas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boxes {
	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		int sum=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum+=a[i];
		}
		for(int i : a) {
			list.add(i);
		}
		s.close();
		Collections.sort(list);
		int target = sum/2;
		   
		if(list.contains(target))
		{
			System.out.println(target);
			System.exit(1);
		}
		else
		{
			int s1=0,s2=0;
			for(int i=0;i<list.size();i++)
			{
				if(s1<=s2)
				{
					l1.add(list.get(i));
					s1+=list.get(i);
				}
				else
				{
					l2.add(list.get(i));
					s2+=list.get(i);
				}
			
			}
		}
			 int sum1=0;
			 int sum2=0;
			 for(int i : l1)
				 sum1+=i;
			 for(int i : l2)
				 sum1+=i;
			 System.out.print(sum1+" "+sum2);
			 if(sum1==sum2)
			 {
				 System.out.println(sum1);
			 }
			 else {
				 System.out.println("Not possible to divide the boxes");
			 }
		}
	
}
