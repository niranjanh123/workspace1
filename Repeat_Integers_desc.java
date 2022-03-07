package apas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Repeat_Integers_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					list.add(a[i]);
					a[j]=Integer.MAX_VALUE;
				}
			}
		}
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}

}
