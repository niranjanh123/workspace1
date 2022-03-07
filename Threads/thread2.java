package Threads;

class addnew implements Runnable{
	public void run() {	
		int a=5,b=10;
		System.out.println("The sum of a and b is:"+(a+b));
	}
}
class subtractnew implements Runnable{
	public void run() {
		int a=5,b=10;
		System.out.println("The difference of a and b is:"+(b-a));
	}
}
public class thread2 {
	public static void main(String[] aregs) {
		Runnable a = new addnew();
		Runnable b  = new subtractnew();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
	}
}