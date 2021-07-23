package chap12.thread.state.yield.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread =new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();//sumThread가 종료할때까지 메인스레드를 일시정지
		} catch (InterruptedException e) {
		}

		
		System.out.println("1~100의 합 :"+ sumThread.getSum());
	}

}
