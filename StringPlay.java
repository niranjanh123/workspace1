package apas;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringPlay {

	public static void main(String[] args) 
	{
		// TODO Auto-generated me
		Scanner s = new Scanner(System.in);
		String a;
		a = s.nextLine();
		int count = compute(a);
		System.out.println(count);
		
	}
//We have to fing the count of BUDH such that the given unstable string can be converated to stable string 
	private static int compute(String a) {
		// TODO Auto-generated method stub
		int count=0;
		StringBuffer b = new StringBuffer();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<a.length();i++) {
			if(map.containsKey(a.charAt(i))) {
				int v = map.get(a.charAt(i))+1;
				map.put(a.charAt(i),v);
			}else {
				map.put(a.charAt(i),1);
			}
		}
		int len = a.length()/4;
		for(Entry<Character,Integer> m:map.entrySet()) {
			int v= m.getValue();
			if(v<len) {
				count+=(len-v);
			}else if(v>len) {
				count+=(v-len);
			}
		}
	
		return count;
	}

}
//k,v   'B',3		int b=0,d=0,u=0,h=0;
//		int arr[]=new int[4];
//		
//		for(int i=0;i<a.length();i++)
//		{
//			if(a.charAt(i)=='B')
//				b++;
//			else if(a.charAt(i)=='D')
//				d++;
//			else if(a.charAt(i)=='U')
//				u++;
//			else if(a.charAt(i)=='H')
//				h++;
//			
//		}
//		arr[0]=b;
//		arr[1]=d;
//		arr[2]=u;
//		arr[3]=h;
//		int len = a.length()/4;
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<(a.length()/4))
//			{
//				x[i]=arr[i];
//				count= count+(len-x[i]);
//			}
//			else if(arr[i]>(a.length()/4))
//			{
//				y[i]=arr[i];
//				count += y[i]-len;			}
//		}
//		return count;
//	}

