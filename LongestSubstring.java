package apas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a;
		a = s.nextLine();
		int n = a.length();
		Set<Character> set = new HashSet<>();
		int ans=0,i=0,j=0;
		while(i<n&&j<n) {
			if(!set.contains(a.charAt(j))) {
				set.add(a.charAt(j++));
				ans = Math.max(ans, j-i);
			}
			else	
			{
				set.remove(a.charAt(i++));
			}
		}
		System.out.println(ans);
	}

	
	}

