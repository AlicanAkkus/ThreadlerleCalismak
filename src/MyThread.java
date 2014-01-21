public class MyThread implements Runnable {

	private final String yazi;
	private final int adet;

	public MyThread(final String yazi, final int adet) {
		this.yazi = yazi;
		this.adet = adet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < adet; i++) {
			System.out.println(yazi + " " + i);
		}
	}

}
