package apas;

import java.util.ArrayList;
import java.util.Scanner;


public class Parantesis_Checker {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		isBalanced(s);
		sc.close();
	}
	static void isBalanced(String s)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
	        {
				list.add(Character.toString(s.charAt(i)));
			}
			
			else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
			{
				if(list.size() != 0 && list.get(list.size()-1).equals("(") && s.charAt(i) == ')')
				{
					list.remove(list.size()-1);
				}
				else if(list.size() != 0 && list.get(list.size()-1).equals("{") && s.charAt(i) == '}')
				{
					list.remove(list.size()-1);
				}
				else if(list.size() != 0 && list.get(list.size()-1).equals("[") && s.charAt(i) == ']')
				{
					list.remove(list.size()-1);
				}
				else if(list.size()==0&&s.charAt(i) == ')') {
					list.add(Character.toString(s.charAt(i)));
				}
				else if(list.size()==0&&s.charAt(i) == ']') {
					list.add(Character.toString(s.charAt(i)));
				}
				else if(list.size()==0&&s.charAt(i) == '}') {
					list.add(Character.toString(s.charAt(i)));
				}
			}
			
		}
		if(list.size() == 0)
		{
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}
	}
	}