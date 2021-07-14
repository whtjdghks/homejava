package homeExample;

public class SwithExample {

	public static void main(String[] args) {
		//다중 선택 
		int num = (int)(Math.random()*6)+1;
		//처음에 num 랜덤 꽂아주고 이번에 다이스 한거니까 0~5까지 6개에서 +1
		//switch 문을 쓸때는 switch()를 if(설정한 변수)라고 생각하고
		// { case그리고 case ? 옆은 변수로 인해 발생된 숫자가 나올시}
		// 숫자에 해당하는 출력값이 나온다.
		switch(num) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2번이 나왔습니다");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다");
			break;
		case 6 :
			System.out.println("6번이 나왔습니다");
			break;
			
		}
	}

}
