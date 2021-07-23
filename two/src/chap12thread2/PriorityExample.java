package chap12thread2;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i);//스레드이름
			
			if(i !=10) {
				thread.setPriority(thread.MIN_PRIORITY);//가장 낮은 우선순위 설정
			}else {
				thread.setPriority(thread.MAX_PRIORITY);//가장 높은 우선순위 설정
			}
			thread.start();
		}

	}

}
