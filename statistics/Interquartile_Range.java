package statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Interquartile_Range {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            b[i] = s.nextInt();
        }
         List<Integer> list = new ArrayList<Integer>();
         int k=0;
         for(int i=0;i<a.length;i++)
         {
             int j=0;
             while(j!=b[k])
             {
                 list.add(a[i]);
                 j++;
             }
             k++;
         }
         int len = list.size();
         int c[] = new int[len];
         for(int i=0;i<len;i++)
         {
             c[i] = list.get(i);
         }
         Arrays.sort(c);
         int l = c.length;
         double res = 0;
         if(l%2==0)
         {
             double p = median(c,0,l/2-1);
             double  q= median(c,(l/2),l-1);
             System.out.println("even p"+p);
             System.out.println("even q"+q);
             res = q-p;
         }
         else
         {
             double p = median(c,0,l/2);
             double q = median(c,(l/2)+1,l-1);
             System.out.println("odd p"+p);
             System.out.println("odd q"+q);
             res = q-p;
         }
         System.out.println(res);
    }
    public static double median(int arr[],int start,int end)
    {
        int length = end - start + 1;
        double median = 0.0;
         if (length % 2 != 0) {
                median = arr[start + length / 2];
            } else {
                median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
            }
            return median;
    }
}
