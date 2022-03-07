package sorting_searhing;

import java.util.Scanner;

public class bubble_sort {
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
		int l = a.length;
		for(int i=0;i<l;i++) {
			for(int j=1;j<l-i;j++) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
