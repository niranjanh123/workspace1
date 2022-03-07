package sorting_searhing;

import java.util.Scanner;

public class merge_sort {
	int arr[];
	int temparr[];
	int length;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		merge_sort b = new merge_sort();
		b.sort(a);
		System.out.println("THE SORTED ARRAY IS:");
		for(int k :a) {
			System.out.print(k+" ");
		}
	}

	private void sort(int[] a) {
		// TODO Auto-generated method stub
		arr = a;
		int l = a.length;
		temparr = new int[l];
		divide(0,l-1);
	}
	
	private void divide(int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
		int mid = (low+high)/2;
		divide(low,mid);
		divide(mid+1,high);
		merge(low,mid,high);
	}

  }

	private void merge(int low, int mid, int high) {
		// TODO Auto-generated method stub
		for(int i = low;i<=high;i++) 
		{
			temparr[i] = arr[i];
		}
		int i = low;
		int j = mid+1;
		int k = low;
		while(i<=mid&&j<=high) 
		{
			if(temparr[i]<=temparr[j]) 
			{
				arr[k]=temparr[i];
				i++;
			}
			else
			{
				arr[k]=temparr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			arr[k] = temparr[i];
			k++;
			i++;
		}
	}
}
