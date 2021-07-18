package homeExample;

public class WhileExample {

	public static void main(String[] args) {
		//0~9까지
//		int i = 0; //기준
//		
//		while(i<10) {//i<10을 만족할때까지 반복 만족되면 스탑
//			System.out.println(i);//i만 있으면 0만 무한출력
//			i++; //증가 연산자 i=i+1; 
//		}
		int total = 0;
		int i =1;
		while(i<=100) {
			total=total+i;
			i++;
		}
		System.out.println(total);
	
	}

}
