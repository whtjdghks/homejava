package chap12.thread.full;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
			
	public static void main(String[] args) throws Exception {//exception감당못하면 던져라 
		ExecutorService excutorService = Executors.newFixedThreadPool(2);
							
		for(int i=0; i<10; i++) {
			Runnable runnable=new Runnable() {
				//익명객체△ } 끝에 ; 필수
				@Override
				public void run() {
					//스레드 총 개수 및 작업 스레드 이름 출력
				ThreadPoolExecutor threadPoolExecutor=
							(ThreadPoolExecutor)excutorService;
				int poolSize = threadPoolExecutor.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.println("[총 스레드 개수 :"+ poolSize+"] 작업스레드 이름 :" + threadName);;
				//예외 발생시킴	
				int value = Integer.parseInt("삼");
				}
		};
			//excutorService.execute(runnable);		//작업처리요청 여긴 정상적인 결과가 안나옴
			excutorService.submit(runnable); 		// submit는 예외를 하지않는다. |정상적인 작업 결과
			Thread.sleep(10);						//즉 오버헤드를 줄이기 위해서
		}
		excutorService.shutdown();//스레드 풀종료
	}

}
