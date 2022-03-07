
package apas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildSequence {
  public static void main()
  {
	  Scanner s = new Scanner(System.in);
	  String input;
	  input = s.nextLine();
	  s.close();
	  String res[] = sequences(input);
	  for(int i=0;i<res.length;i++)
	  {
		  System.out.print(res[i]+",");
	  }
  }

private static String[] sequences(String input) {
	List<String> list = new ArrayList<>();
	
	// TODO Auto-generated method stub
	for(int i=0;i<input.length();i++)
	{
		for(int j=i+1;j<input.length();j++)
		{
			list.add(input.substring(i,j));
		}
	}
		Collections.sort(list);
		String res[] = new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			res[i]=list.get(i);
		}
		return res;
	}

}
