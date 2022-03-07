package sorting_searhing;

import java.util.Scanner;

public class linear_search {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int n = d.nextInt();
		boolean flag = false;
		int index=0;
		int key;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = d.nextInt();
		}
		System.out.println("Enter key");
		key = d.nextInt();
		for(int i =0;i<n;i++) {
			if(a[i]==key) {
				flag =true;
				index  = i;
			}else {
				continue;
			}
		}
		if(flag) {
			System.out.println("The value "+key+" was found at postion :"+(index+1));
		}else {
			System.out.println("The key was not found in the array");
		}
	}

}
