package LinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtStart(5);
		l.insertAtPos(2, 10);
		l.insertAtEnd(25);
		l.show();
		l.FindMiddle();
	}

}
