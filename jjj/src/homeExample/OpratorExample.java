package homeExample;

public class OpratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = (5>4) ? 50:40;
		//참이라면 5>4가 참이라면 50
		//거짓이라면 40이 b1에 들어가게된다.
		System.out.println(b1);
		//참이라 50
		
		int b2 = 0;
		if(5<4){
			b2 = 50;
		}else {
			b2 = 40;
		}
		System.out.println(b2);
	}

}
