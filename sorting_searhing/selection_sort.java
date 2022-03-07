package sorting_searhing;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int min=0;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i]=a[min];
			a[min] = temp;
		}
		return a;

}
}  
