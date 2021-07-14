package homeExample;

public class SwitchCharExample {

	public static void main(String[] args) {
		// char 정수이용 
		char grade = 'A';//한글 쓰고 싶으면 string 가져오셈
		
		switch (grade) {
		case 'A': //경우의 수라고 생각할 수 있지
		case 'a':// 대문자 거나 소문자나 거나
			System.out.println("우수회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}
	}

}
