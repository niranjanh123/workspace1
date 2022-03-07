package Stack;

public class Stack {
	int top=0;
	int max=5;
	int stack[]=new int[max];
	public void push(int data)
	{
		if(top==max)
		{
			System.out.println("The stack is full");
		}
		else
		{
			stack[top]=data;
			top++;
		}
	}
	public void pop()
	{
		if(top==0)
		{
			System.out.println("The stack is empty");
		}
		else
		{
			int val = stack[top-1];
			top--;
			System.out.println("Removed item is:"+val);
		}
	}
	public void show() {
		for(int i=0;i<top;i++)
		{
			System.out.println(stack[i]);
		}
	}
	public void size()
	{
		System.out.println("The size of the stack is "+top);
	}
	public boolean isEmpty()
	{
		if(top<=0)
		{
			return true;
		}
		else
			return false;
	}
}
