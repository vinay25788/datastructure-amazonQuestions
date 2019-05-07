
public class Print1234UsingFourThread implements Runnable {

	private int remainder;

	public static volatile int num=1;

	private Object obj;

	public Print1234UsingFourThread(int rem,Object obj) {
		this.remainder = rem;
		this.obj = obj;
	}

	@Override
	public void run() {

		while (num < 20) {
			synchronized (obj) {
				while (num % 4 != this.remainder) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				obj.notifyAll();
			}
			
		}
	}

	public static void main(String[] args) {
		Object obj = new Object();
		Print1234UsingFourThread one = new Print1234UsingFourThread(1,obj);
		Print1234UsingFourThread two = new Print1234UsingFourThread(2,obj);
		Print1234UsingFourThread third = new Print1234UsingFourThread(3,obj);
		Print1234UsingFourThread four = new Print1234UsingFourThread(0,obj);
		Thread first = new Thread(one, "one");
		Thread second = new Thread(two, "two");
		Thread three = new Thread(third, "third");
		Thread fourth = new Thread(four, "four");
		first.start();
		second.start();
		three.start();
		fourth.start();

	}

}
