package sorting_searhing;

import java.util.Scanner;

public class quick_sort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		quick_sort sort = new quick_sort();
		sort.quick_sort_recursion(a,0,a.length-1);
		System.out.println("The sorted array is :");
		for(int b:a) {
			System.out.print(b+" ");
		}
	}

	private int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = a[(low+high)/2];
		while(low<=high) {
			while(a[low]<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
	void quick_sort_recursion(int arr[],int low,int high) {
		int pi = partition(arr,low,high);
		if(low<pi-1) {
			quick_sort_recursion(arr,low,pi-1);
		}
		if(low<high) {
			quick_sort_recursion(arr,pi,high);
		}
	}
	

}
