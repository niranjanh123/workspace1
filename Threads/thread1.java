package Threads;

public class thread1 extends Thread{
	public static void main(String[] aregs) throws Exception {
		add a= new add();
		subtract b = new subtract();
		a.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		b.start();
		a.join();
		b.join();
		System.out.println("Task End");
		a.setName("Niranjan");
		b.setName("Padmini");
		System.out.println(a.getPriority()+a.getName());
		System.out.println(b.getPriority()+b.getName());
	}
}
class add extends Thread{
	public void run() {	
		int a=5,b=10;
		System.out.println("The sum of a and b is:"+(a+b));
	}
}
class subtract extends Thread{
	public void run() {
		int a=5,b=10;
		System.out.println("The difference of a and b is:"+(b-a));
	}
}
