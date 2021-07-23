package chap12thread3;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public void setmemory(int memory) {//계산기 메모리에 값을 저장하는 메소드
		this.memory=memory;//매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
}
