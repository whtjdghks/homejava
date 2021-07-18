package homeExample;

public class SwitchExam {

	public static void main(String[] args) {
		//switch , case , default , break
		
		int value = 2;
		//jdk 7이상은 문자열도 가능
		//break가 없으면 value 값에 적힌곳부터 밑으로 출력
		switch(value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("그외에 다른 숫자");
		
		}
		String str = "A";//이렇게 스위치 제어로 문자열 만들수있음
		
		switch (str) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		

		default:
			break;
		}
	}

}
