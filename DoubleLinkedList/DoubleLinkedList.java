package DoubleLinkedList;

public class DoubleLinkedList {
	ListNode head;
	ListNode tail;
	int length;
	
	DoubleLinkedList(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	
	private class ListNode{
		int data;
		ListNode prev;
		ListNode next;
		
		ListNode(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}

	public boolean isEmpty() {
		return length==0;
	}
	public int length() {
		return length;
	}
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
			tail=head;
		}else {
			tail.next=newNode;
		}
		newNode.prev=tail;
		tail=newNode;
		length++;
	}
	public void show() {
		if(head== null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			ListNode n = head;
			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
		
	}
	public void showFromLast() {
		if(tail== null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			ListNode n = tail;
			while(n.prev!=null)
			{
				System.out.println(n.data);
				n=n.prev;
			}
			System.out.println(n.data);
		}
		
	}
	public static void main(String[] args) {
		
		DoubleLinkedList l = new DoubleLinkedList();
		l.insertLast(2);
		l.insertLast(3);
		l.insertLast(4);
		//l.show();
		l.showFromLast();
	}

}
