package Threads;
public class thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> {	
			System.out.println("HI");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("Hello");
		});
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
	}
}
