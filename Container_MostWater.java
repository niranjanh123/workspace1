package apas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Container_MostWater {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n;
		n = s.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int no1 = a[i];
			for(int j=i+1;j<n;j++) {
				if(no1==a[j]) {
					int breadth_index=j-i;
					int length_index = no1;
					int res = breadth_index*length_index;
					list.add(res);
				}else
				{
					continue;
				}
			}
		}
		int ans = highest(list);
		System.out.println("The max volune of water that can be contained in the container is "+ ans+"cubic/m");
	}

	private static int highest(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int highest =0;
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			int num= (int) iter.next();
			if(num>highest) {
				highest = num;
			}
		}
		return highest;
	}

}
