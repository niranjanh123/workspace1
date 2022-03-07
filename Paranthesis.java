package apas;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String input = s.next();
int res = compute(input);
System.out.println("THe number of paranthesis that has to be removed are:" + res);
s.close();
}

private static int compute(String input) {
// TODO Auto-generated method stub
Stack<Character> open = new Stack<>();
Stack<Character> close = new Stack<>();
int count=0;
char c[] = input.toCharArray();
for(int i=0;i<input.length();i++)
{
char ch = c[i];
if(ch=='(')
{
open.push(c[i]);
}
else if(ch==')'&&!open.isEmpty())
{
close.push(c[i]);
open.pop();
count++;
}
else
{
close.push(c[i]);
}
}
return c.length - count*2;
}

}
