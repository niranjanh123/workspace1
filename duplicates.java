import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			String a="";
			a = s.nextLine();
			String result = compute(a);
			System.out.println(result);
	}
	public static String compute(String s)
	{
		if(s.length()==0) return "";
		String y=s.toLowerCase();
		StringBuffer res = new StringBuffer();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for(int i=0;i<y.length();i++)
		{
			set.add(y.charAt(i));
		}
		Iterator<Character> it = set.iterator();

		while(it.hasNext())
		{
			char b = it.next();
			res.append(b);
		}
		
		return res.toString();
	}
}
