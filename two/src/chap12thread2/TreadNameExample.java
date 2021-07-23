package chap12thread2;

public class TreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름 :"+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();//ThreadA 새성
		System.out.println("작업 스레드 이름 :" + threadA.getName());
		threadA.start();//threada시작
		
		ThreadB threadB = new ThreadB();//b 생성
		System.out.println("작업 스레드 이름 2 : "+ threadB.getName());
		threadB.start();//b 시작
	}

}
