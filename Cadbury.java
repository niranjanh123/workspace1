package apas;

import java.util.Scanner;

public class Cadbury {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int min_l= s.nextInt();
		int max_l= s.nextInt();
		int min_w= s.nextInt();
		int max_w= s.nextInt();
		int res = 0;
		for(int i=min_l;i<=max_l;i++)
		{
			int res1 = compute1(i,min_w,0);
			int res2 = compute2(1,max_w,0);
			res = res+res1+res2;
			System.out.println(res);
		}
		System.out.println("final:"+res);
	}

	private static int compute2(int i, int max_w,int val) {
		// TODO Auto-generated method stub
		int count1=val,v1=count1;
		int a=i;
		int b = max_w;
		if(a==0&&b==0) { 
			v1 = count1;
		}
		else if(a==1&&b==1) {
			count1++;
			compute2(a-1,b-1,count1);
		}
		else if(a>b)
		{
			a = a-(a-b);
			i=i-a;
			b = max_w;
			count1++;
			compute2(i,max_w,count1);
		}
		else if(a<b)
		{
			b=b-(b-a);
			max_w = max_w-b;
			a = i;
			count1++;
		}
		else if(a==1&&b>1)
		{
			count1 = count1+b;
			a = a-1;
			b = 0;
			compute2(a,b,count1);
		}
		else if(b==1&a>1)
		{
			count1 = count1+a;
			compute2(1,1,count1);
		}
		return count1;
	}

	private static int compute1(int i, int min_w,int val) {
		int count1=val,v2=count1;
		System.out.println(count1);
		int a=i;
		int b = min_w;
		if(a==0&&b==0) { 
			v2 = count1;
		}
		else if(a==1&&b==1) {
			count1++;
			compute1(a-1,b-1,count1);
		}
		else if(a>b)
		{
			a = a-(a-b);
			i=i-a;
			b = min_w;
			count1++;
			compute1(i,min_w,count1);
		}
		else if(a<b)
		{
			b=b-(b-a);
			min_w = min_w-b;
			a = i;
			count1++;
		}
		else if(a==1&&b>1)
		{
			count1 = count1+b;
			System.out.println("a==1"+count1);
			a = a-1;
			b = b-b;
			compute1(a,b,count1);
		}
		else if(b==1&a>1)
		{
			count1 = count1+a;
			compute1(1,1,count1);
		}
		return count1;
	}

}
