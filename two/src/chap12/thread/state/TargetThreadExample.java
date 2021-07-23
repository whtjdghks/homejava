package chap12.thread.state;

public class TargetThreadExample {

	public static void main(String[] args) {
		StatePrintThread statePrintThread =
			new StatePrintThread(new TargetThread());
		statePrintThread.start();

	}

}
