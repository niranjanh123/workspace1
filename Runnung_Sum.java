package apas;

import java.util.Scanner;

public class Runnung_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,sum=0;
		n = s.nextInt();
		int b[] = new int[n];
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=0;j<=i;j++) {
				sum =sum+a[j];	
			}
			b[i]=sum;
	    }
		for(int k:b) {
			System.out.print(" "+k);
		}
    }
}
