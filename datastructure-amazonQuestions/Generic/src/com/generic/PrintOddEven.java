package com.generic;

class Printer {
	public static boolean isEven = true;

	public void printEven(int number) throws InterruptedException {
		synchronized (this) {
			while (isEven == false) {
				this.wait();
			}
			System.out.println(Thread.currentThread().getName() + " " + number);
			isEven = false;
			this.notifyAll();
		}
	}

	public void printOdd(int number) throws InterruptedException {
		synchronized (this) {
			while (isEven == true) {
				this.wait();
			}
			isEven = true;
			System.out.println(Thread.currentThread().getName() + " " + number);
			this.notifyAll();
		}
	}
}

public class PrintOddEven implements Runnable {
	Printer pr;
	boolean isEven;

	PrintOddEven(Printer pr, boolean isEven) {
		this.pr = pr;
		this.isEven = isEven;

	}

	@Override
	public void run() {

		int n = this.isEven == true ? 0 : 1;
		while (n < 10) {
			if (isEven == true) {
				try {
					pr.printEven(n);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					pr.printOdd(n);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			n=n+2;

		}

	}
	
	public static void main(String[] args) {
		Printer pr = new Printer();
		PrintOddEven even = new PrintOddEven(pr, true);
		PrintOddEven odd = new PrintOddEven(pr, false);
		Thread th = new Thread(even,"even");
		Thread oth = new Thread(odd,"odd");
		th.start();
		oth.start();
	}
}












