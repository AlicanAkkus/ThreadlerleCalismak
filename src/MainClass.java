public class MainClass {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Thread thread1 = new Thread(new MyThread("ThreadBir", 2));// Thread
																		// nesnelerimiz
																		// olu�turup
																		// ilk
																		// degerlerini
																		// atiyoruz
		final Thread thread2 = new Thread(new MyThread("ThreadIki", 3));

		System.out.println("Thread 1 calisiyor..");
		thread1.start();// Thread'lar start method'u ile ba�latilir..
		System.out.println("Thread 2 calisiyor..");
		thread2.start();// Thread'lar start method'u ile ba�latilir..

	}

}
