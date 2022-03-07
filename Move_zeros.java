package apas;

import java.util.Scanner;

public class Move_zeros {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = s.nextInt();
		}
		Move_zeros p =new Move_zeros();
		p.moveZeroes(a);
	}


    public void moveZeroes(int[] a) {
        int length = a.length;
        int j;
        for(int i=0;i<length-1;i++)
        {
           
            if(a[i]>0){
                continue;
            }
            else if(a[i]==0)
            {
                 j=i;
                while(a[j]==0&&j<length-1)
                {
                    j++;
                }
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int i:a)
        {
            System.out.print(i+",");
        }
    }
}