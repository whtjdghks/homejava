package chap12;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); //생성만한것
		
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("머리가 띵");
			try {Thread.sleep(500);} 
				catch (Exception e) {
				
			}
		}
	}

}
