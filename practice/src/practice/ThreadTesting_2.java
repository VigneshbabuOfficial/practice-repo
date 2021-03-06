/**
 * 
 */
package practice;

/**
 * @author VigneshBabu
 *
 */
public class ThreadTesting_2 implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTesting_2 t = new ThreadTesting_2();
		ThreadTesting_2 t1 = new ThreadTesting_2();
		Thread th = new Thread(t);
		Thread th1 = new Thread(t1);

		th.setName("vicky");
		th.setDaemon(true);

		th.start();
		try {
			th.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		th1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i + Thread.currentThread().getName() + "running thread priority is:"
					+ Thread.currentThread().getPriority());
		}
	}

}
