package apas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		  String input;
		  input = s.nextLine();
		  s.close();
		  int i;
		   String res[] = sequences(input);
		  for(i=1;i<res.length-1;i++)
		  {
			  System.out.print(res[i]+",");
		  }
		  System.out.print(res[i]);
	}
	private static String[] sequences(String input) {
		
	if(input.length()==0)
	{
		String m[] = {""};
		return m;
	}

	String smallAns[] = sequences(input.substring(1));
	String ans[]  =new String[smallAns.length*2];
	int k=0;
	for(int i=0;i<smallAns.length;i++)
	{
		ans[k]=smallAns[i];
		k++;
	}
	for(int i=0;i<smallAns.length;i++)
	{
		ans[k]=input.charAt(0)+smallAns[i];
		k++;
	}
	Arrays.sort(ans);
	return ans;
  }
}
