import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int res[]  = compute(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] compute(int a[])
	{
		
		if(a.length==0) return new int[] {};
		ArrayList<Integer> l = new ArrayList<>();
		int left=0;
		int right=0;
		while(right<a.length&&left<a.length)
		{
			right=left+1;
			if(a[left]>=a[right])
			{
				l.add(a[left]);
				right++;
			}
			else if(a[left]<a[right])
			{
				left++;
				right=left+1;
			}
			left++;
		}
		l.add(a[a.length-1]);
		int res[] = new int[l.size()];
		Iterator<Integer> it = l.iterator();
		int j=0;
		while(it.hasNext())
		{
			int b = it.next();
			res[j] = b;
			j++;
		}
		return res;
	}

}
