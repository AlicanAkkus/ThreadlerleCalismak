public class OncelikliThread {
	public static void main(final String[] args) {

		final Thread thread1 = new Thread(new MyThread("ThreadBir", 2));
		final Thread thread2 = new Thread(new MyThread("ThreadIki", 3));
		final Thread thread3 = new Thread(new MyThread("ThreadUc", 4));

		thread3.setPriority(Thread.MAX_PRIORITY);// Thread3 en öncelikli thread
													// oldu
		thread1.setPriority(Thread.MIN_PRIORITY);// thread1 ve thread2 ,
		thread2.setPriority(Thread.MIN_PRIORITY);// Thread3'e göre daha az
													// öncelikli oldu...

		thread1.start();// Thread1'i önce cagirmamiza ragmen max öncelikli olan
						// thread3 önce isini bitirir..
		thread2.start();
		thread3.start();

	}
}
