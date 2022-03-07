package apas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,j,k;
		n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-2;i++) {
			for(j=i+1;j<n-1;j++) {
				for(k=i+2;k<n;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}

}
