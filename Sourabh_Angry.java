package apas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sourabh_Angry {
	static int count1,count2,count3;
	public static long[] solve(Long[] arr,long length, long A,long B) {
	
		long res[] = new long[(int) length];
		Long result1;
		Long result2;
		Long result3;
		
		
		for(int i=0;i<arr.length;i++)
		{
			result1 = (long) 0;
			result2 = (long)0;
			result3 = (long)0;
			int x=0,y=0;
			count1=0;
			count2=0;
			count3=0;
			while(result1<arr[i])
			{
				result1 = (long) ((long)Math.pow(A,x)+Math.pow(B,y));
				if(result1<arr[i])
				count1++;
				x++;
			}
			x=1;y=1;
			while(result2<arr[i])
			{
				result2 = (long) ((long)Math.pow(A,x)+Math.pow(B,y));
				if(result2<arr[i])
				count2++;
				y++;
			}
			x=0;y=1;
			while(result3<arr[i])
			{
				result3 = (long) ((long)Math.pow(A,x)+Math.pow(B,y));
				System.out.println(arr[i]+"::"+result3);
				if(result3<arr[i]) {
				count3 = count3+1;
				}
				System.out.println(count3);
				y++;
			}
			res[i] = count1+count2+count3;
		}
		
		return res;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		Long[] arr;
		input = br.readLine();
		long A = Long.parseLong(input);
		input = br.readLine();
		long B = Long.parseLong(input);
		arr= new Long[n];
		input= br.readLine();
		String[] strs = input.trim().split("\\s+");
		for(int i=0;i<strs.length;i++)
		{
			arr[i] = Long.parseLong(strs[i]);
		}
		long ans[] = solve(arr,n,A,B);
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]);
		}
	}

}
