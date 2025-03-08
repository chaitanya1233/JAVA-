class loop1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(3000);

			} catch (Exception e) {
				System.out.println("Error occured.." + e);
			}
		}
	}
}

class loop2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("*");
		}
	}
}

public class t4 {
	public static void main(String[] args) {
		System.out.println("hello I am parent Thread");
		loop1 l1 = new loop1();
		loop2 l2 = new loop2();
		l1.start();
		l2.start();

	}
}