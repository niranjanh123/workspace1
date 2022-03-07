package apas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Node{
	int a;
	int b;
	int c;
}
public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node a1 = new Node();
		a1.a=1;
		a1.b=2;
		a1.c=3;
		Node a2 = new Node();
		a2.a=3;
		a2.b=2;
		a2.c=1;
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(a1);
		list.add(a2);
		result(list);
	}

	private static void result(ArrayList<Node> list) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<Integer>();
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Node n1 = (Node)itr.next();
			int a = (n1.a*100)+(n1.b*10)+n1.c;
			int b=reverse(a);
			res.add(b);
		}
		int sum = res.get(0)+res.get(1);
		System.out.println(sum);
		}

	private static int reverse(int a) {
		// TODO Auto-generated method stub
		int div,sum=0;
		while(a>0) {
			div = a%10;
			sum = sum*10+div;
			a=a/10;
		}
		return sum;
	}
	}

