package apas;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int test_cases=s.nextInt();
			int index=-1;
			for(int i=0;i<test_cases;i++)
			{
				int n = s.nextInt();
				int num = s.nextInt();
				int a[] = new int[n];
				int b[] = new int[n];
				for(int j=0;j<n;j++)
				{
					a[j]=s.nextInt();
				}
				Arrays.sort(a);
				int start=0,end=n-1;
				b[start]=a[0];
				b[end]=a[1];
				for(int y=2;y<a.length&&start<=end;y++)
				{
					if(y%2==0) {
						start+=1;
						b[start]=a[y];
					}else
					{
						end-=1;
						b[end]=a[y];
					}
				}
				
				for(int x=0;x<b.length;x++)
				{
					if(b[x]==num) {
						index=x;
						break;
					}
				}
				if(a[0]==a[1])
				{
					System.out.println(index-1);
				}
				else
				System.out.println(index);
			}
	}

}
