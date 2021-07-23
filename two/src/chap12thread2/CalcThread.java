package chap12thread2;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);//스레드 이름변경
	}
	


public void run() {
	for(int i=0; i<200000000; i++) {
	}
	System.out.println(getName());//실행 스레드
	}
}
