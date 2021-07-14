package homeExample;

public class SwitchNoBreak {

	public static void main(String[] args) {
		// break 없이 가자
		int num=(int)(Math.random()*4)+8;//8부터 11까지 시간
		System.out.println("[현재시간:"+num+"시 입니다.]");
		
		switch (num) {
		case 8 :
			System.out.println("출근합니다");
			//break;
		case 9 :
			System.out.println("회의합니다.");
			//break;
		case 10 :
			System.out.println("업무를 봅니다.");
			//break;
		default :
			System.out.println("외근을 나갑니다.");
		//default :  는 else 처럼 사용할 수 있는데 망할 break;가 있어야함
		}

	}

}
