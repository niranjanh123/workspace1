package apas;

import java.util.Scanner;

public class TwoSums {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,v,index1 = 0,index2=0;
		System.out.println("Enter a number");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter target value");
		v= s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==v) {
					index1 =i;
					index2 =j;
				}else
				{
					continue;
				}
			}
		}
		System.out.println("Indexes are: "+index1+" "+index2);
	}
}
