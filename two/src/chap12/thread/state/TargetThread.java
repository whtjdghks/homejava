package chap12.thread.state;

public class TargetThread extends Thread {
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			//1.5초간 일시정지
			Thread.sleep(1500);
		} catch (Exception e) {}
			
			for(long i=0;i<1000000000; i++) {}
		
	}
}
