package sorting_searhing;

import java.util.Scanner;

public class insertion_sort {
	public static void main(String[] args) {
	int n;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++) {
		a[i] = s.nextInt();
	}
	int b[] = sort(a);
	System.out.println("The sorted array is:");
	for(int i:b) {
		System.out.print(i+" ");
	}
  }

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			j = i;
			while(j>0&&a[j-1]>temp) 
			{
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp;
		}
		return a;
	}
}
