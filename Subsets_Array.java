package apas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Subsets_Array
{
			public static void main(String[] args)
			{
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				String a[] = new String[n];
				for(int i=0;i<n;i++)
				{
					a[i] = s.next();
				}
				int res = compare(a,n);
				System.out.println(res);
			}

			public static int compare(String[] a, int n) {
				// TODO Auto-generated method stub
				int count;
				List<Integer> list = new ArrayList<>();
				for(int i=0;i<n;i++) {
					for(int j=i+1;j<n;j++)
					{
						count=0;
						
						for(int k=0;k<a[i].length();k++)
						{
							for(int l=0;l<a[j].length();l++)
							{
								if(a[i].charAt(k)==a[j].charAt(l))
								{
									count++;
								}
							}
						}
						
						if(count==0)
						{
							int m = Integer.parseInt(a[i]);
							int p = Integer.parseInt(a[j]);
							list.add((m+p));
						}
					}
				}
				Collections.sort(list);
				int result = list.get(list.size()-1);
				return result;
			}
}
