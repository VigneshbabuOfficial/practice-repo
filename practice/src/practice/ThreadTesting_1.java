/**
 * 
 */
package practice;

/**
 * @author VigneshBabu
 *
 */
public class ThreadTesting_1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		
		ThreadTesting_1 t = new ThreadTesting_1();
		t.start();
	}

}
