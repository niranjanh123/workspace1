package LinkedList;

public class LinkedList {
		Node head;
		public void insertAtEnd(int data)
		{
			Node node = new Node();
			node.data=data;
			node.next=null;
			if(head==null)
			{
				head= node;
			}else {
				Node n = head;
				while(n.next!=null)
				{
					n=n.next;
				}
				n.next = node;
			}
		}
		public void show()
		{
			
				Node n = head;
				while(n.next!=null)
				{
					System.out.println("inserted:"+n.data);
					n=n.next;
				}
				System.out.println("inserted:"+n.data);
		}
		public void insertAtStart(int data)
		{
			Node node = new Node();
			node.data=data;
			node.next=null;
			if(head==null)
			{
				head=node;
			}
			else
			{
				node.next=head;
				head=node;
			}
		}
		public void insertAtPos(int index,int data)
		{
			Node node = new Node();
			node.data=data;
			node.next=null;
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
		public void DeleteAtStart()
		{
			if(head==null)
			{
				System.out.println("There is no node to be deleted");
			}
			else
			{
				head=head.next;
			}
		}
		public void DeleteAtEnd()
		{
			Node current=head;
			Node prev = null;
			while(current.next!=null)
			{
				prev= current;
				current = current.next;	
			}
			prev.next=null;
		}
		public void DeleteAtPos(int index)
		{
			Node n=head;
			Node prev = null;
			for(int i=0;i<index;i++)
			{
				prev = n;
				n=n.next;
			}
			prev.next=n.next;
			n.next=null;
		}
		public void Reverse()
		{
			Node current=head;
			Node prev=null;
			Node next=null;
			if(head==null)
			{
				System.out.println("The list is empty and hence it cannot be reversed");
			}
			else
			{	
				while(current!=null)
				{
					next=current.next;
					current.next=prev;
					prev=current;
					current=next;
				}
			}
			System.out.println("The reverse list:");
			Node n = prev;
			while(n.next!=null)
			{
				System.out.println("inserted:"+n.data);
				n=n.next;
			}
			System.out.println("inserted:"+n.data);
		}
		public void FindMiddle()
		{
			Node a=head;
			Node b=head;
			while(a.next!=null&&a!=null&&a.next.next!=null)
			{
				b=b.next;
				a=a.next.next;
			}
			System.out.println("The middle element is :"+b.data);
		}
		
}
