package apas;

import java.util.Scanner;

public class Mango_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int max = 0;
		int sum=0,prev_step = a[0];
		for(int i=0;i<a.length-1;i++) {
			if(i>0)
			{
			prev_step = a[i-1];
			}
			int temp = sum;
			max = Math.max(max, Math.abs(a[i]-a[i+1]));
			if(max>temp)
			{
				sum = max;
				
			}
			else if(max==temp&&a[i+1]==prev_step)
			{
				sum = sum+max;
				
			}
			else if(max==temp)
			{
				sum = max;
			
			}
		}
		System.out.println(sum);
	
	}

}
