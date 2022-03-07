package Threads;

class Q 
{
	int num;
	boolean value = false;
	public synchronized void getNum() {
		while(!value) 
		{
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Get :"+num);
		value = false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(value)
		{
			try {wait();}catch(Exception e) {}
		}
		this.num = num;
		System.out.println("Set :"+num);
		value = true;
		notify();
	}	
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true)
		{
			q.setNum(i++);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		while(true)
		{
			q.getNum();
		}
	}
}
public class producer_consumer_problem {
	public static void main(String[] args)
	{
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
