package Stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.show();
		s.size();
		System.out.println("Stack is empty: "+s.isEmpty());
		
	}

}
