package homeExample;

public class NoMethod {
	public static void number() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++; /* 메서드 없이 한건데 메서드 대신해서 변수를 집어넣고
그 변수를 아래 처럼 메인 메서드를 만든후에 값을 넣어서 반복 계수를 정할수 있다.
			0~9 +1 을  밑에 변수 수만큼 진행
			*/
		}
	}
	public static void main(String[] args) {
		number();
		number();
		number();
		number();
		number();
		
	}
}
