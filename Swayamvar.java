package apas;

import java.util.Scanner;

public class Swayamvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int c=0,r=0,m=0;
		int n = s.nextInt();
		String b = s.next();
		String g =s.next();
		for(int i=0;i<n;i++)
		{
			if(g.charAt(i)=='r')
			{
				r+=1;
			}else
			{
				m+=1;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(b.charAt(j)=='r')
			{
				if(r>0)
				{
					r-=1;
					c++;
				}
				else {
					break;
				}
			}
			else
			{
				if(m>0)
				{
					m-=1;
					c++;
				}else {
					break;
				}
			}
		}
		System.out.println(n-c);
	}

}
